// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryObservationMetricsRequest extends TeaModel {
    /**
     * <p>The API Key ID to use for filtering the results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    /**
     * <p>The client ID to use for filtering the results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <p>The end time of a custom time range for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-02T00:00:00Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The field to use for grouping the results.</p>
     * 
     * <strong>example:</strong>
     * <p>resourceId</p>
     */
    @NameInMap("groupBy")
    public String groupBy;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The model ID to use for filtering the results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    /**
     * <p>Specifies whether to return the total count of results.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("needTotalCount")
    public Boolean needTotalCount;

    /**
     * <p>The token used to retrieve the next page of results, obtained from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The field to use for sorting the results.</p>
     * 
     * <strong>example:</strong>
     * <p>resourceId</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>The sort order. Valid values: <code>ASC</code> (ascending) and <code>DESC</code> (descending).</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <p>The page number to retrieve.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The start time of a custom time range for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The time range for the query. Valid values: <code>1h</code>, <code>6h</code>, <code>24h</code>, <code>7d</code>, and <code>30d</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>24h</p>
     */
    @NameInMap("timeRange")
    public String timeRange;

    public static ModelRouterQueryObservationMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryObservationMetricsRequest self = new ModelRouterQueryObservationMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryObservationMetricsRequest setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    public ModelRouterQueryObservationMetricsRequest setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public ModelRouterQueryObservationMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModelRouterQueryObservationMetricsRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public ModelRouterQueryObservationMetricsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryObservationMetricsRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public ModelRouterQueryObservationMetricsRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public ModelRouterQueryObservationMetricsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryObservationMetricsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ModelRouterQueryObservationMetricsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ModelRouterQueryObservationMetricsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ModelRouterQueryObservationMetricsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ModelRouterQueryObservationMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ModelRouterQueryObservationMetricsRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
