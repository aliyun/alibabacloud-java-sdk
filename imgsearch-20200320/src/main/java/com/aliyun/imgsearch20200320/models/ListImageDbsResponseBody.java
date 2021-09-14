// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class ListImageDbsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListImageDbsResponseBodyData data;

    public static ListImageDbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageDbsResponseBody self = new ListImageDbsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageDbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageDbsResponseBody setData(ListImageDbsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListImageDbsResponseBodyData getData() {
        return this.data;
    }

    public static class ListImageDbsResponseBodyDataDbList extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListImageDbsResponseBodyDataDbList build(java.util.Map<String, ?> map) throws Exception {
            ListImageDbsResponseBodyDataDbList self = new ListImageDbsResponseBodyDataDbList();
            return TeaModel.build(map, self);
        }

        public ListImageDbsResponseBodyDataDbList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListImageDbsResponseBodyData extends TeaModel {
        @NameInMap("DbList")
        public java.util.List<ListImageDbsResponseBodyDataDbList> dbList;

        public static ListImageDbsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListImageDbsResponseBodyData self = new ListImageDbsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListImageDbsResponseBodyData setDbList(java.util.List<ListImageDbsResponseBodyDataDbList> dbList) {
            this.dbList = dbList;
            return this;
        }
        public java.util.List<ListImageDbsResponseBodyDataDbList> getDbList() {
            return this.dbList;
        }

    }

}
