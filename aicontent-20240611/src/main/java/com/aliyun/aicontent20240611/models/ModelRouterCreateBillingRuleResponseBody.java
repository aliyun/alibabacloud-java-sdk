// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateBillingRuleResponseBody extends TeaModel {
    @NameInMap("data")
    public ModelRouterCreateBillingRuleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterCreateBillingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateBillingRuleResponseBody self = new ModelRouterCreateBillingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateBillingRuleResponseBody setData(ModelRouterCreateBillingRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterCreateBillingRuleResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterCreateBillingRuleResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterCreateBillingRuleResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterCreateBillingRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterCreateBillingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterCreateBillingRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterCreateBillingRuleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>token_tiered</p>
         */
        @NameInMap("billingType")
        public String billingType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("deleteTag")
        public Integer deleteTag;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("effectiveTime")
        public String effectiveTime;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01T00:00:00Z</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("modelCode")
        public String modelCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("modelId")
        public Long modelId;

        /**
         * <strong>example:</strong>
         * <p>通义千问Plus</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>chat</p>
         */
        @NameInMap("modelType")
        public String modelType;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("pricingConfig")
        public Object pricingConfig;

        /**
         * <strong>example:</strong>
         * <p>alibaba</p>
         */
        @NameInMap("symbol")
        public String symbol;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Integer version;

        public static ModelRouterCreateBillingRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterCreateBillingRuleResponseBodyData self = new ModelRouterCreateBillingRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterCreateBillingRuleResponseBodyData setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setDeleteTag(Integer deleteTag) {
            this.deleteTag = deleteTag;
            return this;
        }
        public Integer getDeleteTag() {
            return this.deleteTag;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setPricingConfig(Object pricingConfig) {
            this.pricingConfig = pricingConfig;
            return this;
        }
        public Object getPricingConfig() {
            return this.pricingConfig;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }
        public String getSymbol() {
            return this.symbol;
        }

        public ModelRouterCreateBillingRuleResponseBodyData setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
