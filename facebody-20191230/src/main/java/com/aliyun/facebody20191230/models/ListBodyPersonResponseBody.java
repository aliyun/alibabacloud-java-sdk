// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListBodyPersonResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListBodyPersonResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListBodyPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBodyPersonResponseBody self = new ListBodyPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBodyPersonResponseBody setData(ListBodyPersonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBodyPersonResponseBodyData getData() {
        return this.data;
    }

    public ListBodyPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBodyPersonResponseBodyDataPersonList extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("TraceCount")
        public Long traceCount;

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

        public ListBodyPersonResponseBodyDataPersonList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
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

    }

    public static class ListBodyPersonResponseBodyData extends TeaModel {
        @NameInMap("PersonList")
        public java.util.List<ListBodyPersonResponseBodyDataPersonList> personList;

        @NameInMap("Total")
        public Long total;

        public static ListBodyPersonResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBodyPersonResponseBodyData self = new ListBodyPersonResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBodyPersonResponseBodyData setPersonList(java.util.List<ListBodyPersonResponseBodyDataPersonList> personList) {
            this.personList = personList;
            return this;
        }
        public java.util.List<ListBodyPersonResponseBodyDataPersonList> getPersonList() {
            return this.personList;
        }

        public ListBodyPersonResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
