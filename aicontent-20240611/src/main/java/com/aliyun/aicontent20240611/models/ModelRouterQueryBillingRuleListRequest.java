// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryBillingRuleListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("activeOnly")
    public Boolean activeOnly;

    /**
     * <p>maxResults</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

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
    public Integer modelId;

    /**
     * <strong>example:</strong>
     * <p>chat</p>
     */
    @NameInMap("modelType")
    public String modelType;

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
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ModelRouterQueryBillingRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryBillingRuleListRequest self = new ModelRouterQueryBillingRuleListRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryBillingRuleListRequest setActiveOnly(Boolean activeOnly) {
        this.activeOnly = activeOnly;
        return this;
    }
    public Boolean getActiveOnly() {
        return this.activeOnly;
    }

    public ModelRouterQueryBillingRuleListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryBillingRuleListRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public ModelRouterQueryBillingRuleListRequest setModelId(Integer modelId) {
        this.modelId = modelId;
        return this;
    }
    public Integer getModelId() {
        return this.modelId;
    }

    public ModelRouterQueryBillingRuleListRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ModelRouterQueryBillingRuleListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryBillingRuleListRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ModelRouterQueryBillingRuleListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ModelRouterQueryBillingRuleListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
