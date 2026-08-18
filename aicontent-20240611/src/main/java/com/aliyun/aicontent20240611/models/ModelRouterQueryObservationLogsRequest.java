// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryObservationLogsRequest extends TeaModel {
    /**
     * <p>The API key ID used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    /**
     * <p>The client ID used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <p>The list of department IDs, separated by commas. You can query data for multiple departments. This parameter is mutually exclusive with client_id.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("clientIds")
    public String clientIds;

    /**
     * <p>The custom end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-02T00:00:00Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The field by which to group the results.</p>
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
     * <p>Optional. Filters results by member user IDs, separated by commas. If not specified, data for the department and all its members is returned. If an empty value is specified, only department data without member data is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>30001,30002</p>
     */
    @NameInMap("memberUserIds")
    public String memberUserIds;

    /**
     * <p>The model ID used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    /**
     * <p>Specifies whether to return the total count.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("needTotalCount")
    public Boolean needTotalCount;

    /**
     * <p>The pagination token. An empty value indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The field by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>resourceId</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>The sort direction.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The custom start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The time range for the query. Valid values: 1h, 6h, 24h, 7d, and 30d.</p>
     * 
     * <strong>example:</strong>
     * <p>24h</p>
     */
    @NameInMap("timeRange")
    public String timeRange;

    public static ModelRouterQueryObservationLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryObservationLogsRequest self = new ModelRouterQueryObservationLogsRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryObservationLogsRequest setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    public ModelRouterQueryObservationLogsRequest setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public ModelRouterQueryObservationLogsRequest setClientIds(String clientIds) {
        this.clientIds = clientIds;
        return this;
    }
    public String getClientIds() {
        return this.clientIds;
    }

    public ModelRouterQueryObservationLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModelRouterQueryObservationLogsRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public ModelRouterQueryObservationLogsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryObservationLogsRequest setMemberUserIds(String memberUserIds) {
        this.memberUserIds = memberUserIds;
        return this;
    }
    public String getMemberUserIds() {
        return this.memberUserIds;
    }

    public ModelRouterQueryObservationLogsRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public ModelRouterQueryObservationLogsRequest setNeedTotalCount(Boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    public ModelRouterQueryObservationLogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryObservationLogsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ModelRouterQueryObservationLogsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ModelRouterQueryObservationLogsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ModelRouterQueryObservationLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ModelRouterQueryObservationLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ModelRouterQueryObservationLogsRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
