// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryBillingCostBreakdownRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    /**
     * <p>The ID of the client to query. If not specified, data for all clients is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <p>The end time for the query, specified as a Unix timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1700086400</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The granularity for data aggregation. Valid values: <code>hourly</code> and <code>daily</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hourly</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>The maximum number of results to return. This parameter is used for pagination along with <code>nextToken</code> and is mutually exclusive with <code>page</code> and <code>pageSize</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The ID of the model to query. If not specified, data for all models is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    /**
     * <p>The types of the models to query, separated by commas. For example: <code>Chat,Embedding</code>. If not specified, data for all model types is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Chat</p>
     */
    @NameInMap("modelTypes")
    public String modelTypes;

    /**
     * <p>The pagination token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page. Default: 20. Maximum: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The start time for the query, specified as a Unix timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static ModelRouterQueryBillingCostBreakdownRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryBillingCostBreakdownRequest self = new ModelRouterQueryBillingCostBreakdownRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryBillingCostBreakdownRequest setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    public ModelRouterQueryBillingCostBreakdownRequest setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public ModelRouterQueryBillingCostBreakdownRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ModelRouterQueryBillingCostBreakdownRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public ModelRouterQueryBillingCostBreakdownRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryBillingCostBreakdownRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public ModelRouterQueryBillingCostBreakdownRequest setModelTypes(String modelTypes) {
        this.modelTypes = modelTypes;
        return this;
    }
    public String getModelTypes() {
        return this.modelTypes;
    }

    public ModelRouterQueryBillingCostBreakdownRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryBillingCostBreakdownRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ModelRouterQueryBillingCostBreakdownRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ModelRouterQueryBillingCostBreakdownRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
