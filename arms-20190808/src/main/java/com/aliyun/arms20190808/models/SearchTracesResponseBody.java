// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTracesResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The details of the returned traces.
    @NameInMap("TraceInfos")
    public java.util.List<SearchTracesResponseBodyTraceInfos> traceInfos;

    public static SearchTracesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesResponseBody self = new SearchTracesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTracesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTracesResponseBody setTraceInfos(java.util.List<SearchTracesResponseBodyTraceInfos> traceInfos) {
        this.traceInfos = traceInfos;
        return this;
    }
    public java.util.List<SearchTracesResponseBodyTraceInfos> getTraceInfos() {
        return this.traceInfos;
    }

    public static class SearchTracesResponseBodyTraceInfos extends TeaModel {
        // The amount of time consumed by the trace. Unit: milliseconds.
        @NameInMap("Duration")
        public Long duration;

        // The name of the traced span.
        @NameInMap("OperationName")
        public String operationName;

        // The IP address of the host where the application resides.
        @NameInMap("ServiceIp")
        public String serviceIp;

        // The name of the application.
        @NameInMap("ServiceName")
        public String serviceName;

        // The timestamp.
        @NameInMap("Timestamp")
        public Long timestamp;

        // The ID of the trace.
        @NameInMap("TraceID")
        public String traceID;

        public static SearchTracesResponseBodyTraceInfos build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesResponseBodyTraceInfos self = new SearchTracesResponseBodyTraceInfos();
            return TeaModel.build(map, self);
        }

        public SearchTracesResponseBodyTraceInfos setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public SearchTracesResponseBodyTraceInfos setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public SearchTracesResponseBodyTraceInfos setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public SearchTracesResponseBodyTraceInfos setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public SearchTracesResponseBodyTraceInfos setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SearchTracesResponseBodyTraceInfos setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

    }

}
