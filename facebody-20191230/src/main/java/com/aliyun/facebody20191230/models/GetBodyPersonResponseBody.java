// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GetBodyPersonResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetBodyPersonResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetBodyPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBodyPersonResponseBody self = new GetBodyPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBodyPersonResponseBody setData(GetBodyPersonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBodyPersonResponseBodyData getData() {
        return this.data;
    }

    public GetBodyPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBodyPersonResponseBodyDataTraceList extends TeaModel {
        @NameInMap("ExtraData")
        public String extraData;

        @NameInMap("Id")
        public Long id;

        public static GetBodyPersonResponseBodyDataTraceList build(java.util.Map<String, ?> map) throws Exception {
            GetBodyPersonResponseBodyDataTraceList self = new GetBodyPersonResponseBodyDataTraceList();
            return TeaModel.build(map, self);
        }

        public GetBodyPersonResponseBodyDataTraceList setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public GetBodyPersonResponseBodyDataTraceList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetBodyPersonResponseBodyData extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("TraceCount")
        public Long traceCount;

        @NameInMap("TraceList")
        public java.util.List<GetBodyPersonResponseBodyDataTraceList> traceList;

        public static GetBodyPersonResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBodyPersonResponseBodyData self = new GetBodyPersonResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBodyPersonResponseBodyData setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetBodyPersonResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBodyPersonResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBodyPersonResponseBodyData setTraceCount(Long traceCount) {
            this.traceCount = traceCount;
            return this;
        }
        public Long getTraceCount() {
            return this.traceCount;
        }

        public GetBodyPersonResponseBodyData setTraceList(java.util.List<GetBodyPersonResponseBodyDataTraceList> traceList) {
            this.traceList = traceList;
            return this;
        }
        public java.util.List<GetBodyPersonResponseBodyDataTraceList> getTraceList() {
            return this.traceList;
        }

    }

}
