// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateModelTokenRateLimitResponseBody extends TeaModel {
    /**
     * <p>The result code of the request. The value is Ok if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The saved limits, version, and rule IDs for the current model.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;gatewayId&quot;:&quot;gw-example01&quot;,&quot;modelId&quot;:&quot;msc-example01&quot;,&quot;revision&quot;:1,&quot;appliedRevision&quot;:1,&quot;globalTpm&quot;:1800,&quot;consumers&quot;:[{&quot;consumerId&quot;:&quot;cs-example01&quot;,&quot;tpm&quot;:300}],&quot;globalRuleId&quot;:&quot;model-tpm/gw-example01/msc-example01/global&quot;,&quot;consumerRuleIds&quot;:{&quot;cs-example01&quot;:&quot;model-tpm/gw-example01/msc-example01/consumer/cs-example01&quot;}}</p>
     */
    @NameInMap("data")
    public UpdateModelTokenRateLimitResponseBodyData data;

    /**
     * <p>The cause of the error. This parameter is omitted if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified gateway does not exist.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>7A35E9B2-4C16-4E90-8A71-24F3BB508C01</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateModelTokenRateLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelTokenRateLimitResponseBody self = new UpdateModelTokenRateLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModelTokenRateLimitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateModelTokenRateLimitResponseBody setData(UpdateModelTokenRateLimitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateModelTokenRateLimitResponseBodyData getData() {
        return this.data;
    }

    public UpdateModelTokenRateLimitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateModelTokenRateLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateModelTokenRateLimitResponseBodyDataConsumers extends TeaModel {
        /**
         * <p>The ID of the consumer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-example01</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <p>The tokens per minute (TPM) limit for the consumer using this model.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("tpm")
        public Long tpm;

        public static UpdateModelTokenRateLimitResponseBodyDataConsumers build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelTokenRateLimitResponseBodyDataConsumers self = new UpdateModelTokenRateLimitResponseBodyDataConsumers();
            return TeaModel.build(map, self);
        }

        public UpdateModelTokenRateLimitResponseBodyDataConsumers setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public UpdateModelTokenRateLimitResponseBodyDataConsumers setTpm(Long tpm) {
            this.tpm = tpm;
            return this;
        }
        public Long getTpm() {
            return this.tpm;
        }

    }

    public static class UpdateModelTokenRateLimitResponseBodyData extends TeaModel {
        /**
         * <p>The configuration version that was last successfully delivered to the control plane.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("appliedRevision")
        public Long appliedRevision;

        /**
         * <p>The mapping of consumer IDs to model throttling rule IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cs-example01&quot;:&quot;model-tpm/gw-example01/msc-example01/consumer/cs-example01&quot;}</p>
         */
        @NameInMap("consumerRuleIds")
        public java.util.Map<String, String> consumerRuleIds;

        /**
         * <p>The list of configured consumer limits for the model.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;consumerId&quot;:&quot;cs-example01&quot;,&quot;tpm&quot;:300}]</p>
         */
        @NameInMap("consumers")
        public java.util.List<UpdateModelTokenRateLimitResponseBodyDataConsumers> consumers;

        /**
         * <p>The instance ID of the dedicated AI gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-example01</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The rule ID for the global model limit, which can be matched with the rule hits in the gateway throttling logs. This parameter is returned only when the global limit is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>model-tpm/gw-example01/msc-example01/global</p>
         */
        @NameInMap("globalRuleId")
        public String globalRuleId;

        /**
         * <p>The global tokens per minute (TPM) limit shared by all consumers for the model within the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("globalTpm")
        public Long globalTpm;

        /**
         * <p>The actual model card ID that starts with msc- or the logical model ID that starts with vm-.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-example01</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <p>The saved version of the model throttling configuration. Pass this value as expectedRevision for subsequent modifications.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("revision")
        public Long revision;

        public static UpdateModelTokenRateLimitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelTokenRateLimitResponseBodyData self = new UpdateModelTokenRateLimitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateModelTokenRateLimitResponseBodyData setAppliedRevision(Long appliedRevision) {
            this.appliedRevision = appliedRevision;
            return this;
        }
        public Long getAppliedRevision() {
            return this.appliedRevision;
        }

        public UpdateModelTokenRateLimitResponseBodyData setConsumerRuleIds(java.util.Map<String, String> consumerRuleIds) {
            this.consumerRuleIds = consumerRuleIds;
            return this;
        }
        public java.util.Map<String, String> getConsumerRuleIds() {
            return this.consumerRuleIds;
        }

        public UpdateModelTokenRateLimitResponseBodyData setConsumers(java.util.List<UpdateModelTokenRateLimitResponseBodyDataConsumers> consumers) {
            this.consumers = consumers;
            return this;
        }
        public java.util.List<UpdateModelTokenRateLimitResponseBodyDataConsumers> getConsumers() {
            return this.consumers;
        }

        public UpdateModelTokenRateLimitResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public UpdateModelTokenRateLimitResponseBodyData setGlobalRuleId(String globalRuleId) {
            this.globalRuleId = globalRuleId;
            return this;
        }
        public String getGlobalRuleId() {
            return this.globalRuleId;
        }

        public UpdateModelTokenRateLimitResponseBodyData setGlobalTpm(Long globalTpm) {
            this.globalTpm = globalTpm;
            return this;
        }
        public Long getGlobalTpm() {
            return this.globalTpm;
        }

        public UpdateModelTokenRateLimitResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public UpdateModelTokenRateLimitResponseBodyData setRevision(Long revision) {
            this.revision = revision;
            return this;
        }
        public Long getRevision() {
            return this.revision;
        }

    }

}
