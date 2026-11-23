// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateModelTokenRateLimitRequest extends TeaModel {
    /**
     * <p>The complete list of consumer limits. Pass an empty array to clear the consumer limits for the model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;consumerId&quot;:&quot;cs-example01&quot;,&quot;tpm&quot;:300}]</p>
     */
    @NameInMap("consumers")
    public java.util.List<UpdateModelTokenRateLimitRequestConsumers> consumers;

    /**
     * <p>The revision returned by the last query. Set this parameter to 0 for the first configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("expectedRevision")
    public Long expectedRevision;

    /**
     * <p>The global tokens per minute (TPM) limit for the model within the instance. If this parameter is omitted, the global limit is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("globalTpm")
    public Long globalTpm;

    public static UpdateModelTokenRateLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelTokenRateLimitRequest self = new UpdateModelTokenRateLimitRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelTokenRateLimitRequest setConsumers(java.util.List<UpdateModelTokenRateLimitRequestConsumers> consumers) {
        this.consumers = consumers;
        return this;
    }
    public java.util.List<UpdateModelTokenRateLimitRequestConsumers> getConsumers() {
        return this.consumers;
    }

    public UpdateModelTokenRateLimitRequest setExpectedRevision(Long expectedRevision) {
        this.expectedRevision = expectedRevision;
        return this;
    }
    public Long getExpectedRevision() {
        return this.expectedRevision;
    }

    public UpdateModelTokenRateLimitRequest setGlobalTpm(Long globalTpm) {
        this.globalTpm = globalTpm;
        return this;
    }
    public Long getGlobalTpm() {
        return this.globalTpm;
    }

    public static class UpdateModelTokenRateLimitRequestConsumers extends TeaModel {
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

        public static UpdateModelTokenRateLimitRequestConsumers build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelTokenRateLimitRequestConsumers self = new UpdateModelTokenRateLimitRequestConsumers();
            return TeaModel.build(map, self);
        }

        public UpdateModelTokenRateLimitRequestConsumers setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public UpdateModelTokenRateLimitRequestConsumers setTpm(Long tpm) {
            this.tpm = tpm;
            return this;
        }
        public Long getTpm() {
            return this.tpm;
        }

    }

}
