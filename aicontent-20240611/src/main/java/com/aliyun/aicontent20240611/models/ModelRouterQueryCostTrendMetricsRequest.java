// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryCostTrendMetricsRequest extends TeaModel {
    /**
     * <p>Optional. Filters results by API Key ID. This parameter works in conjunction with the department and requires clientId to be specified first.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    /**
     * <p>Filters results by department ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <p>The end time, in UNIX timestamp format (seconds).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1700086400</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The time granularity. Valid values:</p>
     * <ul>
     * <li>hourly</li>
     * <li>daily</li>
     * </ul>
     * <p>Default value: hourly.</p>
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
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Optional. Filters results by members (member IDs, separated by commas). If not specified, the department and all its members are included. If an empty value is specified, only the department is included without members.</p>
     * 
     * <strong>example:</strong>
     * <p>30001,30002</p>
     */
    @NameInMap("memberUserIds")
    public String memberUserIds;

    /**
     * <p>The model types, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>LLM,VL</p>
     */
    @NameInMap("modelTypes")
    public String modelTypes;

    /**
     * <p>nextToken</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The start time, in UNIX timestamp format (seconds).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static ModelRouterQueryCostTrendMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryCostTrendMetricsRequest self = new ModelRouterQueryCostTrendMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryCostTrendMetricsRequest setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    public ModelRouterQueryCostTrendMetricsRequest setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public ModelRouterQueryCostTrendMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ModelRouterQueryCostTrendMetricsRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public ModelRouterQueryCostTrendMetricsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryCostTrendMetricsRequest setMemberUserIds(String memberUserIds) {
        this.memberUserIds = memberUserIds;
        return this;
    }
    public String getMemberUserIds() {
        return this.memberUserIds;
    }

    public ModelRouterQueryCostTrendMetricsRequest setModelTypes(String modelTypes) {
        this.modelTypes = modelTypes;
        return this;
    }
    public String getModelTypes() {
        return this.modelTypes;
    }

    public ModelRouterQueryCostTrendMetricsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryCostTrendMetricsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
