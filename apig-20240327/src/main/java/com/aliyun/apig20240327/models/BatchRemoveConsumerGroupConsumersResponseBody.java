// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchRemoveConsumerGroupConsumersResponseBody extends TeaModel {
    /**
     * <p>The response status code. Ok is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public BatchRemoveConsumerGroupConsumersResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static BatchRemoveConsumerGroupConsumersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchRemoveConsumerGroupConsumersResponseBody self = new BatchRemoveConsumerGroupConsumersResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchRemoveConsumerGroupConsumersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchRemoveConsumerGroupConsumersResponseBody setData(BatchRemoveConsumerGroupConsumersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchRemoveConsumerGroupConsumersResponseBodyData getData() {
        return this.data;
    }

    public BatchRemoveConsumerGroupConsumersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchRemoveConsumerGroupConsumersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchRemoveConsumerGroupConsumersResponseBodyData extends TeaModel {
        /**
         * <p>The list of consumer IDs that failed to be removed.</p>
         */
        @NameInMap("failedConsumerIds")
        public java.util.List<String> failedConsumerIds;

        /**
         * <p>The list of consumer IDs skipped because they are not in the consumer group.</p>
         */
        @NameInMap("skippedConsumerIds")
        public java.util.List<String> skippedConsumerIds;

        /**
         * <p>The list of consumer IDs successfully removed from the consumer group.</p>
         */
        @NameInMap("successConsumerIds")
        public java.util.List<String> successConsumerIds;

        public static BatchRemoveConsumerGroupConsumersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchRemoveConsumerGroupConsumersResponseBodyData self = new BatchRemoveConsumerGroupConsumersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchRemoveConsumerGroupConsumersResponseBodyData setFailedConsumerIds(java.util.List<String> failedConsumerIds) {
            this.failedConsumerIds = failedConsumerIds;
            return this;
        }
        public java.util.List<String> getFailedConsumerIds() {
            return this.failedConsumerIds;
        }

        public BatchRemoveConsumerGroupConsumersResponseBodyData setSkippedConsumerIds(java.util.List<String> skippedConsumerIds) {
            this.skippedConsumerIds = skippedConsumerIds;
            return this;
        }
        public java.util.List<String> getSkippedConsumerIds() {
            return this.skippedConsumerIds;
        }

        public BatchRemoveConsumerGroupConsumersResponseBodyData setSuccessConsumerIds(java.util.List<String> successConsumerIds) {
            this.successConsumerIds = successConsumerIds;
            return this;
        }
        public java.util.List<String> getSuccessConsumerIds() {
            return this.successConsumerIds;
        }

    }

}
