// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateBillingRuleResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ModelRouterUpdateBillingRuleResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterUpdateBillingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateBillingRuleResponseBody self = new ModelRouterUpdateBillingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateBillingRuleResponseBody setData(ModelRouterUpdateBillingRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterUpdateBillingRuleResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterUpdateBillingRuleResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterUpdateBillingRuleResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterUpdateBillingRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterUpdateBillingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterUpdateBillingRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterUpdateBillingRuleResponseBodyData extends TeaModel {
        /**
         * <p>The billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>token_tiered</p>
         */
        @NameInMap("billingType")
        public String billingType;

        /**
         * <p>The deletion tag.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("deleteTag")
        public Integer deleteTag;

        /**
         * <p>The time when the rule takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("effectiveTime")
        public String effectiveTime;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T00:00:00Z</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("modelCode")
        public String modelCode;

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("modelId")
        public Long modelId;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>通义千问Plus</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model type.</p>
         * 
         * <strong>example:</strong>
         * <p>chat</p>
         */
        @NameInMap("modelType")
        public String modelType;

        /**
         * <p>The billing configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("pricingConfig")
        public Object pricingConfig;

        /**
         * <p>The vendor ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba</p>
         */
        @NameInMap("symbol")
        public String symbol;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Integer version;

        public static ModelRouterUpdateBillingRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterUpdateBillingRuleResponseBodyData self = new ModelRouterUpdateBillingRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setDeleteTag(Integer deleteTag) {
            this.deleteTag = deleteTag;
            return this;
        }
        public Integer getDeleteTag() {
            return this.deleteTag;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setPricingConfig(Object pricingConfig) {
            this.pricingConfig = pricingConfig;
            return this;
        }
        public Object getPricingConfig() {
            return this.pricingConfig;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }
        public String getSymbol() {
            return this.symbol;
        }

        public ModelRouterUpdateBillingRuleResponseBodyData setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
