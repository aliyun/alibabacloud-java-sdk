// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GetBodyPersonResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetBodyPersonResponseBodyData data;

    public static GetBodyPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBodyPersonResponseBody self = new GetBodyPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBodyPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBodyPersonResponseBody setData(GetBodyPersonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBodyPersonResponseBodyData getData() {
        return this.data;
    }

    public static class GetBodyPersonResponseBodyDataTraceList extends TeaModel {
        // TraceId
        @NameInMap("Id")
        public Long id;

        // 自定义Trace信息
        @NameInMap("ExtraData")
        public String extraData;

        public static GetBodyPersonResponseBodyDataTraceList build(java.util.Map<String, ?> map) throws Exception {
            GetBodyPersonResponseBodyDataTraceList self = new GetBodyPersonResponseBodyDataTraceList();
            return TeaModel.build(map, self);
        }

        public GetBodyPersonResponseBodyDataTraceList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBodyPersonResponseBodyDataTraceList setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

    }

    public static class GetBodyPersonResponseBodyData extends TeaModel {
        // 数据库ID
        @NameInMap("DbId")
        public Long dbId;

        // 人员ID
        @NameInMap("Id")
        public Long id;

        // 人员名称
        @NameInMap("Name")
        public String name;

        // Trace数量
        @NameInMap("TraceCount")
        public Long traceCount;

        // Trace列表
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
