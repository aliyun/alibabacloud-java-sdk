// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryCostOverviewMetricsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    /**
     * <p>The department ID used to filter the results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>The granularity of the data. Valid values: <code>hourly</code> and <code>daily</code>. Default value: <code>hourly</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>hourly</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>The maximum number of results to return in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The model types to query. Separate multiple types with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>LLM,VL</p>
     */
    @NameInMap("modelTypes")
    public String modelTypes;

    /**
     * <p>The token to retrieve the next page of results. If you do not specify this parameter, the first page of results is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The start time for the query, specified as a Unix timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static ModelRouterQueryCostOverviewMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryCostOverviewMetricsRequest self = new ModelRouterQueryCostOverviewMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryCostOverviewMetricsRequest setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    public ModelRouterQueryCostOverviewMetricsRequest setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public ModelRouterQueryCostOverviewMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ModelRouterQueryCostOverviewMetricsRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public ModelRouterQueryCostOverviewMetricsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryCostOverviewMetricsRequest setModelTypes(String modelTypes) {
        this.modelTypes = modelTypes;
        return this;
    }
    public String getModelTypes() {
        return this.modelTypes;
    }

    public ModelRouterQueryCostOverviewMetricsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryCostOverviewMetricsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
