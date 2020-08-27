// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListFaceDbsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListFaceDbsResponseData data;

    public static ListFaceDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFaceDbsResponse self = new ListFaceDbsResponse();
        return TeaModel.build(map, self);
    }

    public ListFaceDbsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFaceDbsResponse setData(ListFaceDbsResponseData data) {
        this.data = data;
        return this;
    }
    public ListFaceDbsResponseData getData() {
        return this.data;
    }

    public static class ListFaceDbsResponseDataDbList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static ListFaceDbsResponseDataDbList build(java.util.Map<String, ?> map) throws Exception {
            ListFaceDbsResponseDataDbList self = new ListFaceDbsResponseDataDbList();
            return TeaModel.build(map, self);
        }

        public ListFaceDbsResponseDataDbList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListFaceDbsResponseData extends TeaModel {
        @NameInMap("DbList")
        @Validation(required = true)
        public java.util.List<ListFaceDbsResponseDataDbList> dbList;

        public static ListFaceDbsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListFaceDbsResponseData self = new ListFaceDbsResponseData();
            return TeaModel.build(map, self);
        }

        public ListFaceDbsResponseData setDbList(java.util.List<ListFaceDbsResponseDataDbList> dbList) {
            this.dbList = dbList;
            return this;
        }
        public java.util.List<ListFaceDbsResponseDataDbList> getDbList() {
            return this.dbList;
        }

    }

}
