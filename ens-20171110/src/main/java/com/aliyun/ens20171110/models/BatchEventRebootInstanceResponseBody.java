// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventRebootInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result.</p>
     */
    @NameInMap("Results")
    public java.util.List<BatchEventRebootInstanceResponseBodyResults> results;

    public static BatchEventRebootInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchEventRebootInstanceResponseBody self = new BatchEventRebootInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchEventRebootInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchEventRebootInstanceResponseBody setResults(java.util.List<BatchEventRebootInstanceResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchEventRebootInstanceResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchEventRebootInstanceResponseBodyResults extends TeaModel {
        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The ID of the system event.</p>
         * 
         * <strong>example:</strong>
         * <p>e-d71ff150945b9c02eb6ebc0016328468</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The message of the operation. If the value of the Code parameter is 200, the value of this parameter is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The resource IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>i-55qi8m11rr53c4i964md8a00l</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static BatchEventRebootInstanceResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchEventRebootInstanceResponseBodyResults self = new BatchEventRebootInstanceResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchEventRebootInstanceResponseBodyResults setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public BatchEventRebootInstanceResponseBodyResults setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public BatchEventRebootInstanceResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchEventRebootInstanceResponseBodyResults setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
