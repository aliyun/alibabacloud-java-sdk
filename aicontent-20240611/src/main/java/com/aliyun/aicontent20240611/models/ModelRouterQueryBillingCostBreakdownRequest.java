// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryBillingCostBreakdownRequest extends TeaModel {
    /**
     * <p>Optional. Filters results by API key ID. This parameter is linked with the department. Specify clientId first.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    /**
     * <p>Optional. Filters results by department ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <p>The query end time, in UNIX timestamp (seconds).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1700086400</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The aggregation granularity. Valid values:</p>
     * <ul>
     * <li>hourly</li>
     * <li>daily</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hourly</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Optional. Filters results by member ID. Separate multiple values with commas. If not specified, the department and all its members are included. If an empty value is specified, only the department is included without members.</p>
     * 
     * <strong>example:</strong>
     * <p>30001,30002</p>
     */
    @NameInMap("memberUserIds")
    public String memberUserIds;

    /**
     * <p>Optional. Filters results by model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    /**
     * <p>Optional. Filters results by model type. Separate multiple values with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>Chat</p>
     */
    @NameInMap("modelTypes")
    public String modelTypes;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The query start time, in UNIX timestamp (seconds).</p>
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

    public ModelRouterQueryBillingCostBreakdownRequest setMemberUserIds(String memberUserIds) {
        this.memberUserIds = memberUserIds;
        return this;
    }
    public String getMemberUserIds() {
        return this.memberUserIds;
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
