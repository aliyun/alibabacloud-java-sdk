// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryBillingRuleListResponseBody extends TeaModel {
    @NameInMap("data")
    public ModelRouterQueryBillingRuleListResponseBodyData data;

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
     * <p>maxResults</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>nextToken</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

    public static ModelRouterQueryBillingRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryBillingRuleListResponseBody self = new ModelRouterQueryBillingRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryBillingRuleListResponseBody setData(ModelRouterQueryBillingRuleListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterQueryBillingRuleListResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterQueryBillingRuleListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryBillingRuleListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryBillingRuleListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryBillingRuleListResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryBillingRuleListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryBillingRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryBillingRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterQueryBillingRuleListResponseBodyDataList extends TeaModel {
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

        public static ModelRouterQueryBillingRuleListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryBillingRuleListResponseBodyDataList self = new ModelRouterQueryBillingRuleListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setDeleteTag(Integer deleteTag) {
            this.deleteTag = deleteTag;
            return this;
        }
        public Integer getDeleteTag() {
            return this.deleteTag;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setPricingConfig(Object pricingConfig) {
            this.pricingConfig = pricingConfig;
            return this;
        }
        public Object getPricingConfig() {
            return this.pricingConfig;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }
        public String getSymbol() {
            return this.symbol;
        }

        public ModelRouterQueryBillingRuleListResponseBodyDataList setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ModelRouterQueryBillingRuleListResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ModelRouterQueryBillingRuleListResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ModelRouterQueryBillingRuleListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryBillingRuleListResponseBodyData self = new ModelRouterQueryBillingRuleListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryBillingRuleListResponseBodyData setList(java.util.List<ModelRouterQueryBillingRuleListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ModelRouterQueryBillingRuleListResponseBodyDataList> getList() {
            return this.list;
        }

        public ModelRouterQueryBillingRuleListResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ModelRouterQueryBillingRuleListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ModelRouterQueryBillingRuleListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
