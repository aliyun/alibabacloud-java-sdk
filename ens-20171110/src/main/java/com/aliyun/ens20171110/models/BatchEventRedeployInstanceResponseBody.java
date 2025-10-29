// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventRedeployInstanceResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of results.</p>
     */
    @NameInMap("Results")
    public java.util.List<BatchEventRedeployInstanceResponseBodyResults> results;

    public static BatchEventRedeployInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchEventRedeployInstanceResponseBody self = new BatchEventRedeployInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchEventRedeployInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchEventRedeployInstanceResponseBody setResults(java.util.List<BatchEventRedeployInstanceResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchEventRedeployInstanceResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchEventRedeployInstanceResponseBodyResults extends TeaModel {
        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>System event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e-d71ff150945b9c02eb6ebc0016328468</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>Operational message, when code=200, the message is \&quot;successful\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-55qi8m11rr53c4i964md8a00l</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static BatchEventRedeployInstanceResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchEventRedeployInstanceResponseBodyResults self = new BatchEventRedeployInstanceResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchEventRedeployInstanceResponseBodyResults setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public BatchEventRedeployInstanceResponseBodyResults setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public BatchEventRedeployInstanceResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchEventRedeployInstanceResponseBodyResults setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
