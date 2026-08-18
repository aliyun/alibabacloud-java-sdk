// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryCostModelListRequest extends TeaModel {
    /**
     * <p>Optional. Filters results by API Key ID. This parameter is linked to the department and requires clientId to be specified first.</p>
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
     * <p>The list of department IDs, separated by commas. Supports querying data for multiple departments. This parameter is mutually exclusive with clientId.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("clientIds")
    public String clientIds;

    /**
     * <p>The end time, in UNIX timestamp (seconds).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1700086400</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>Automatically aggregated. No input required. Granularity: hourly/daily. Default value: hourly.</p>
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
     * <p>Optional. Filters results by members (member IDs, separated by commas). If not specified, the department and all its members are included. If an empty value is passed, only the department is included without members.</p>
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
     * <p>Fuzzy search by model name or code.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("search")
    public String search;

    /**
     * <p>The start time, in UNIX timestamp (seconds).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static ModelRouterQueryCostModelListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryCostModelListRequest self = new ModelRouterQueryCostModelListRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryCostModelListRequest setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    public ModelRouterQueryCostModelListRequest setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public ModelRouterQueryCostModelListRequest setClientIds(String clientIds) {
        this.clientIds = clientIds;
        return this;
    }
    public String getClientIds() {
        return this.clientIds;
    }

    public ModelRouterQueryCostModelListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ModelRouterQueryCostModelListRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public ModelRouterQueryCostModelListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterQueryCostModelListRequest setMemberUserIds(String memberUserIds) {
        this.memberUserIds = memberUserIds;
        return this;
    }
    public String getMemberUserIds() {
        return this.memberUserIds;
    }

    public ModelRouterQueryCostModelListRequest setModelTypes(String modelTypes) {
        this.modelTypes = modelTypes;
        return this;
    }
    public String getModelTypes() {
        return this.modelTypes;
    }

    public ModelRouterQueryCostModelListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterQueryCostModelListRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ModelRouterQueryCostModelListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
