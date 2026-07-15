// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchAddConsumerGroupConsumersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public BatchAddConsumerGroupConsumersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static BatchAddConsumerGroupConsumersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchAddConsumerGroupConsumersResponseBody self = new BatchAddConsumerGroupConsumersResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchAddConsumerGroupConsumersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchAddConsumerGroupConsumersResponseBody setData(BatchAddConsumerGroupConsumersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchAddConsumerGroupConsumersResponseBodyData getData() {
        return this.data;
    }

    public BatchAddConsumerGroupConsumersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchAddConsumerGroupConsumersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchAddConsumerGroupConsumersResponseBodyData extends TeaModel {
        @NameInMap("failedConsumerIds")
        public java.util.List<String> failedConsumerIds;

        @NameInMap("skippedConsumerIds")
        public java.util.List<String> skippedConsumerIds;

        @NameInMap("successConsumerIds")
        public java.util.List<String> successConsumerIds;

        public static BatchAddConsumerGroupConsumersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchAddConsumerGroupConsumersResponseBodyData self = new BatchAddConsumerGroupConsumersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchAddConsumerGroupConsumersResponseBodyData setFailedConsumerIds(java.util.List<String> failedConsumerIds) {
            this.failedConsumerIds = failedConsumerIds;
            return this;
        }
        public java.util.List<String> getFailedConsumerIds() {
            return this.failedConsumerIds;
        }

        public BatchAddConsumerGroupConsumersResponseBodyData setSkippedConsumerIds(java.util.List<String> skippedConsumerIds) {
            this.skippedConsumerIds = skippedConsumerIds;
            return this;
        }
        public java.util.List<String> getSkippedConsumerIds() {
            return this.skippedConsumerIds;
        }

        public BatchAddConsumerGroupConsumersResponseBodyData setSuccessConsumerIds(java.util.List<String> successConsumerIds) {
            this.successConsumerIds = successConsumerIds;
            return this;
        }
        public java.util.List<String> getSuccessConsumerIds() {
            return this.successConsumerIds;
        }

    }

}
