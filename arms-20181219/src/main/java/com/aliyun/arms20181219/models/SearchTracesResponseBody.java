// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20181219.models;

import com.aliyun.tea.*;

public class SearchTracesResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchTracesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SearchTracesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesResponseBody self = new SearchTracesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTracesResponseBody setData(SearchTracesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchTracesResponseBodyData getData() {
        return this.data;
    }

    public SearchTracesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchTracesResponseBodyDataTraceInfo extends TeaModel {
        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("OperationName")
        public String operationName;

        @NameInMap("ServiceIp")
        public String serviceIp;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TraceID")
        public String traceID;

        public static SearchTracesResponseBodyDataTraceInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesResponseBodyDataTraceInfo self = new SearchTracesResponseBodyDataTraceInfo();
            return TeaModel.build(map, self);
        }

        public SearchTracesResponseBodyDataTraceInfo setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public SearchTracesResponseBodyDataTraceInfo setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public SearchTracesResponseBodyDataTraceInfo setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public SearchTracesResponseBodyDataTraceInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public SearchTracesResponseBodyDataTraceInfo setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SearchTracesResponseBodyDataTraceInfo setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

    }

    public static class SearchTracesResponseBodyData extends TeaModel {
        @NameInMap("TraceInfo")
        public java.util.List<SearchTracesResponseBodyDataTraceInfo> traceInfo;

        public static SearchTracesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesResponseBodyData self = new SearchTracesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchTracesResponseBodyData setTraceInfo(java.util.List<SearchTracesResponseBodyDataTraceInfo> traceInfo) {
            this.traceInfo = traceInfo;
            return this;
        }
        public java.util.List<SearchTracesResponseBodyDataTraceInfo> getTraceInfo() {
            return this.traceInfo;
        }

    }

}
