// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetBillingBillSummaryRequest extends TeaModel {
    /**
     * <p>The API key ID used to filter results. This parameter is optional and linked to the department. You must specify clientId first.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    /**
     * <p>The department ID used to filter results.</p>
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
     * <p>The end time, in UNIX timestamp format (seconds).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1700086400</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The member IDs used to filter results, separated by commas. This parameter is optional. If not specified, the query returns data for the department and all its members. If an empty value is specified, the query returns data for the department only, excluding members.</p>
     * 
     * <strong>example:</strong>
     * <p>30001,30002</p>
     */
    @NameInMap("memberUserIds")
    public String memberUserIds;

    /**
     * <p>The model ID. This parameter is optional and used to filter by model.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    /**
     * <p>The model types, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>Chat,ChatMultimodal</p>
     */
    @NameInMap("modelTypes")
    public String modelTypes;

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

    public static ModelRouterGetBillingBillSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetBillingBillSummaryRequest self = new ModelRouterGetBillingBillSummaryRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetBillingBillSummaryRequest setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    public ModelRouterGetBillingBillSummaryRequest setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public ModelRouterGetBillingBillSummaryRequest setClientIds(String clientIds) {
        this.clientIds = clientIds;
        return this;
    }
    public String getClientIds() {
        return this.clientIds;
    }

    public ModelRouterGetBillingBillSummaryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ModelRouterGetBillingBillSummaryRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterGetBillingBillSummaryRequest setMemberUserIds(String memberUserIds) {
        this.memberUserIds = memberUserIds;
        return this;
    }
    public String getMemberUserIds() {
        return this.memberUserIds;
    }

    public ModelRouterGetBillingBillSummaryRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public ModelRouterGetBillingBillSummaryRequest setModelTypes(String modelTypes) {
        this.modelTypes = modelTypes;
        return this;
    }
    public String getModelTypes() {
        return this.modelTypes;
    }

    public ModelRouterGetBillingBillSummaryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterGetBillingBillSummaryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
