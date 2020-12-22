// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListFaceDbsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListFaceDbsResponseBodyData data;

    public static ListFaceDbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFaceDbsResponseBody self = new ListFaceDbsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFaceDbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFaceDbsResponseBody setData(ListFaceDbsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFaceDbsResponseBodyData getData() {
        return this.data;
    }

    public static class ListFaceDbsResponseBodyDataDbList extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListFaceDbsResponseBodyDataDbList build(java.util.Map<String, ?> map) throws Exception {
            ListFaceDbsResponseBodyDataDbList self = new ListFaceDbsResponseBodyDataDbList();
            return TeaModel.build(map, self);
        }

        public ListFaceDbsResponseBodyDataDbList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListFaceDbsResponseBodyData extends TeaModel {
        @NameInMap("DbList")
        public java.util.List<ListFaceDbsResponseBodyDataDbList> dbList;

        public static ListFaceDbsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFaceDbsResponseBodyData self = new ListFaceDbsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFaceDbsResponseBodyData setDbList(java.util.List<ListFaceDbsResponseBodyDataDbList> dbList) {
            this.dbList = dbList;
            return this;
        }
        public java.util.List<ListFaceDbsResponseBodyDataDbList> getDbList() {
            return this.dbList;
        }

    }

}
