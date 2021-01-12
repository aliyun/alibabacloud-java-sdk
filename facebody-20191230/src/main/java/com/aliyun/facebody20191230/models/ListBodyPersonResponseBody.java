// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListBodyPersonResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListBodyPersonResponseBodyData data;

    public static ListBodyPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBodyPersonResponseBody self = new ListBodyPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBodyPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBodyPersonResponseBody setData(ListBodyPersonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBodyPersonResponseBodyData getData() {
        return this.data;
    }

    public static class ListBodyPersonResponseBodyDataPersonList extends TeaModel {
        // 数据库ID
        @NameInMap("DbId")
        public Long dbId;

        // 人员名称
        @NameInMap("Name")
        public String name;

        // Trace数量
        @NameInMap("TraceCount")
        public Long traceCount;

        // 人员ID
        @NameInMap("Id")
        public Long id;

        public static ListBodyPersonResponseBodyDataPersonList build(java.util.Map<String, ?> map) throws Exception {
            ListBodyPersonResponseBodyDataPersonList self = new ListBodyPersonResponseBodyDataPersonList();
            return TeaModel.build(map, self);
        }

        public ListBodyPersonResponseBodyDataPersonList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListBodyPersonResponseBodyDataPersonList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBodyPersonResponseBodyDataPersonList setTraceCount(Long traceCount) {
            this.traceCount = traceCount;
            return this;
        }
        public Long getTraceCount() {
            return this.traceCount;
        }

        public ListBodyPersonResponseBodyDataPersonList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListBodyPersonResponseBodyData extends TeaModel {
        // 数据总量
        @NameInMap("Total")
        public Long total;

        @NameInMap("PersonList")
        public java.util.List<ListBodyPersonResponseBodyDataPersonList> personList;

        public static ListBodyPersonResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBodyPersonResponseBodyData self = new ListBodyPersonResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBodyPersonResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListBodyPersonResponseBodyData setPersonList(java.util.List<ListBodyPersonResponseBodyDataPersonList> personList) {
            this.personList = personList;
            return this;
        }
        public java.util.List<ListBodyPersonResponseBodyDataPersonList> getPersonList() {
            return this.personList;
        }

    }

}
