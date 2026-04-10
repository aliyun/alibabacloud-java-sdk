// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class ExchangeEntitlementResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ExchangeEntitlementResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("retryAble")
    public Boolean retryAble;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExchangeEntitlementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExchangeEntitlementResponseBody self = new ExchangeEntitlementResponseBody();
        return TeaModel.build(map, self);
    }

    public ExchangeEntitlementResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExchangeEntitlementResponseBody setData(ExchangeEntitlementResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExchangeEntitlementResponseBodyData getData() {
        return this.data;
    }

    public ExchangeEntitlementResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExchangeEntitlementResponseBody setRetryAble(Boolean retryAble) {
        this.retryAble = retryAble;
        return this;
    }
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    public ExchangeEntitlementResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExchangeEntitlementResponseBodyDataTemplate extends TeaModel {
        @NameInMap("allowedModels")
        public java.util.List<String> allowedModels;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("quotaLimit")
        public Long quotaLimit;

        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("templateId")
        public Long templateId;

        /**
         * <strong>example:</strong>
         * <p>基础版 Token 包</p>
         */
        @NameInMap("templateName")
        public String templateName;

        /**
         * <strong>example:</strong>
         * <p>TOKEN_PACK</p>
         */
        @NameInMap("type")
        public String type;

        public static ExchangeEntitlementResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            ExchangeEntitlementResponseBodyDataTemplate self = new ExchangeEntitlementResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public ExchangeEntitlementResponseBodyDataTemplate setAllowedModels(java.util.List<String> allowedModels) {
            this.allowedModels = allowedModels;
            return this;
        }
        public java.util.List<String> getAllowedModels() {
            return this.allowedModels;
        }

        public ExchangeEntitlementResponseBodyDataTemplate setQuotaLimit(Long quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public Long getQuotaLimit() {
            return this.quotaLimit;
        }

        public ExchangeEntitlementResponseBodyDataTemplate setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ExchangeEntitlementResponseBodyDataTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ExchangeEntitlementResponseBodyDataTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ExchangeEntitlementResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sk_live_abc123xyz789</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("effectiveAt")
        public String effectiveAt;

        /**
         * <strong>example:</strong>
         * <p><a href="https://llm-gateway.example.com/acme">https://llm-gateway.example.com/acme</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>2024-01-31T23:59:59Z</p>
         */
        @NameInMap("expireAt")
        public String expireAt;

        /**
         * <strong>example:</strong>
         * <p>a1b2c3d4e5f6...</p>
         */
        @NameInMap("keyHash")
        public String keyHash;

        /**
         * <strong>example:</strong>
         * <p>ORD20240101000001</p>
         */
        @NameInMap("redemptionOrderNo")
        public String redemptionOrderNo;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("reused")
        public Boolean reused;

        @NameInMap("template")
        public ExchangeEntitlementResponseBodyDataTemplate template;

        public static ExchangeEntitlementResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExchangeEntitlementResponseBodyData self = new ExchangeEntitlementResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExchangeEntitlementResponseBodyData setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ExchangeEntitlementResponseBodyData setEffectiveAt(String effectiveAt) {
            this.effectiveAt = effectiveAt;
            return this;
        }
        public String getEffectiveAt() {
            return this.effectiveAt;
        }

        public ExchangeEntitlementResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ExchangeEntitlementResponseBodyData setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

        public ExchangeEntitlementResponseBodyData setKeyHash(String keyHash) {
            this.keyHash = keyHash;
            return this;
        }
        public String getKeyHash() {
            return this.keyHash;
        }

        public ExchangeEntitlementResponseBodyData setRedemptionOrderNo(String redemptionOrderNo) {
            this.redemptionOrderNo = redemptionOrderNo;
            return this;
        }
        public String getRedemptionOrderNo() {
            return this.redemptionOrderNo;
        }

        public ExchangeEntitlementResponseBodyData setReused(Boolean reused) {
            this.reused = reused;
            return this;
        }
        public Boolean getReused() {
            return this.reused;
        }

        public ExchangeEntitlementResponseBodyData setTemplate(ExchangeEntitlementResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public ExchangeEntitlementResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

    }

}
