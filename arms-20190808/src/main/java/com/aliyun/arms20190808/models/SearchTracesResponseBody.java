// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTracesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C518054-852F-4023-ABC1-4AF95FF7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the returned traces.</p>
     */
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
        /**
         * <p>The amount of time consumed by the trace. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The name of the traced span.</p>
         * 
         * <strong>example:</strong>
         * <p>get***</p>
         */
        @NameInMap("OperationName")
        public String operationName;

        /**
         * <p>The IP address of the host where the application resides.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.**.**</p>
         */
        @NameInMap("ServiceIp")
        public String serviceIp;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-k8s-demo-subcomponent</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1595174436993</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ac1400a115951744369937024d****</p>
         */
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
