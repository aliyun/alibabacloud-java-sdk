// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventMigrateInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FF53E96D-3F1A-42F0-8373-1C2B39D72D44</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchEventMigrateInstanceResponseBodyResults> results;

    public static BatchEventMigrateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchEventMigrateInstanceResponseBody self = new BatchEventMigrateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchEventMigrateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchEventMigrateInstanceResponseBody setResults(java.util.List<BatchEventMigrateInstanceResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchEventMigrateInstanceResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchEventMigrateInstanceResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <strong>example:</strong>
         * <p>e-d71ff150945b9c02eb6ebc0016328468</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>i-55qi8m11rr53c4i964md8a00l</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        public static BatchEventMigrateInstanceResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchEventMigrateInstanceResponseBodyResults self = new BatchEventMigrateInstanceResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchEventMigrateInstanceResponseBodyResults setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public BatchEventMigrateInstanceResponseBodyResults setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public BatchEventMigrateInstanceResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchEventMigrateInstanceResponseBodyResults setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
