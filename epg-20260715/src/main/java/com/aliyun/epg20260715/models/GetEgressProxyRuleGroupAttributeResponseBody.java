// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class GetEgressProxyRuleGroupAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-10-16T15:34:56Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>eppool-gw80d96a96ca0b00****</p>
     */
    @NameInMap("EgressProxyIpPoolId")
    public String egressProxyIpPoolId;

    /**
     * <strong>example:</strong>
     * <p>eprg-uf60966a9633667c****</p>
     */
    @NameInMap("EgressProxyRuleGroupId")
    public String egressProxyRuleGroupId;

    /**
     * <strong>example:</strong>
     * <p>testEpg</p>
     */
    @NameInMap("EgressProxyRuleGroupName")
    public String egressProxyRuleGroupName;

    @NameInMap("EgressProxyRules")
    public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRules egressProxyRules;

    /**
     * <strong>example:</strong>
     * <p>01A05AB5-5BED-56ED-8EE9-304FBC2F8537</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmzvr2nr****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyTags> tags;

    public static GetEgressProxyRuleGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEgressProxyRuleGroupAttributeResponseBody self = new GetEgressProxyRuleGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEgressProxyRuleGroupAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetEgressProxyRuleGroupAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetEgressProxyRuleGroupAttributeResponseBody setEgressProxyIpPoolId(String egressProxyIpPoolId) {
        this.egressProxyIpPoolId = egressProxyIpPoolId;
        return this;
    }
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    public GetEgressProxyRuleGroupAttributeResponseBody setEgressProxyRuleGroupId(String egressProxyRuleGroupId) {
        this.egressProxyRuleGroupId = egressProxyRuleGroupId;
        return this;
    }
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

    public GetEgressProxyRuleGroupAttributeResponseBody setEgressProxyRuleGroupName(String egressProxyRuleGroupName) {
        this.egressProxyRuleGroupName = egressProxyRuleGroupName;
        return this;
    }
    public String getEgressProxyRuleGroupName() {
        return this.egressProxyRuleGroupName;
    }

    public GetEgressProxyRuleGroupAttributeResponseBody setEgressProxyRules(GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRules egressProxyRules) {
        this.egressProxyRules = egressProxyRules;
        return this;
    }
    public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRules getEgressProxyRules() {
        return this.egressProxyRules;
    }

    public GetEgressProxyRuleGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEgressProxyRuleGroupAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetEgressProxyRuleGroupAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetEgressProxyRuleGroupAttributeResponseBody setTags(java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponseConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>request:DestinationDomain</p>
         */
        @NameInMap("ConditionKey")
        public String conditionKey;

        /**
         * <strong>example:</strong>
         * <p>StringEquals</p>
         */
        @NameInMap("ConditionOperator")
        public String conditionOperator;

        @NameInMap("ConditionValues")
        public java.util.List<String> conditionValues;

        public static GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponseConditions build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponseConditions self = new GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponseConditions();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponseConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponseConditions setConditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            return this;
        }
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponseConditions setConditionValues(java.util.List<String> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

    }

    public static class GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("Action")
        public String action;

        @NameInMap("Conditions")
        public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponseConditions> conditions;

        /**
         * <strong>example:</strong>
         * <p>2026-01-15T11:58:34Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>epr-gw80bb6a91dbb775****</p>
         */
        @NameInMap("EgressProxyRuleId")
        public String egressProxyRuleId;

        /**
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyRuleName")
        public String egressProxyRuleName;

        /**
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse self = new GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse setConditions(java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponseConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponseConditions> getConditions() {
            return this.conditions;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse setEgressProxyRuleId(String egressProxyRuleId) {
            this.egressProxyRuleId = egressProxyRuleId;
            return this;
        }
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse setEgressProxyRuleName(String egressProxyRuleName) {
            this.egressProxyRuleName = egressProxyRuleName;
            return this;
        }
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDnsConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>request:DestinationDomain</p>
         */
        @NameInMap("ConditionKey")
        public String conditionKey;

        /**
         * <strong>example:</strong>
         * <p>StringEquals</p>
         */
        @NameInMap("ConditionOperator")
        public String conditionOperator;

        @NameInMap("ConditionValues")
        public java.util.List<String> conditionValues;

        public static GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDnsConditions build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDnsConditions self = new GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDnsConditions();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDnsConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDnsConditions setConditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            return this;
        }
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDnsConditions setConditionValues(java.util.List<String> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

    }

    public static class GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("Action")
        public String action;

        @NameInMap("Conditions")
        public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDnsConditions> conditions;

        /**
         * <strong>example:</strong>
         * <p>2024-08-19T03:34:29Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>epr-gw80bb6a91dbb775****</p>
         */
        @NameInMap("EgressProxyRuleId")
        public String egressProxyRuleId;

        /**
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyRuleName")
        public String egressProxyRuleName;

        /**
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns self = new GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns setConditions(java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDnsConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDnsConditions> getConditions() {
            return this.conditions;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns setEgressProxyRuleId(String egressProxyRuleId) {
            this.egressProxyRuleId = egressProxyRuleId;
            return this;
        }
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns setEgressProxyRuleName(String egressProxyRuleName) {
            this.egressProxyRuleName = egressProxyRuleName;
            return this;
        }
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequestConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>request:DestinationDomain</p>
         */
        @NameInMap("ConditionKey")
        public String conditionKey;

        /**
         * <strong>example:</strong>
         * <p>StringEquals</p>
         */
        @NameInMap("ConditionOperator")
        public String conditionOperator;

        @NameInMap("ConditionValues")
        public java.util.List<String> conditionValues;

        public static GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequestConditions build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequestConditions self = new GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequestConditions();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequestConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequestConditions setConditionOperator(String conditionOperator) {
            this.conditionOperator = conditionOperator;
            return this;
        }
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequestConditions setConditionValues(java.util.List<String> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

    }

    public static class GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("Action")
        public String action;

        @NameInMap("Conditions")
        public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequestConditions> conditions;

        /**
         * <strong>example:</strong>
         * <p>2024-12-20T15:58:33.343</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>epr-gw80bb6a91dbb775****</p>
         */
        @NameInMap("EgressProxyRuleId")
        public String egressProxyRuleId;

        /**
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyRuleName")
        public String egressProxyRuleName;

        /**
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest self = new GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest setConditions(java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequestConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequestConditions> getConditions() {
            return this.conditions;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest setEgressProxyRuleId(String egressProxyRuleId) {
            this.egressProxyRuleId = egressProxyRuleId;
            return this;
        }
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest setEgressProxyRuleName(String egressProxyRuleName) {
            this.egressProxyRuleName = egressProxyRuleName;
            return this;
        }
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRules extends TeaModel {
        @NameInMap("PostResponse")
        public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse> postResponse;

        @NameInMap("PreDns")
        public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns> preDns;

        @NameInMap("PreRequest")
        public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest> preRequest;

        public static GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRules build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRules self = new GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRules();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRules setPostResponse(java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse> postResponse) {
            this.postResponse = postResponse;
            return this;
        }
        public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPostResponse> getPostResponse() {
            return this.postResponse;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRules setPreDns(java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns> preDns) {
            this.preDns = preDns;
            return this;
        }
        public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreDns> getPreDns() {
            return this.preDns;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRules setPreRequest(java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest> preRequest) {
            this.preRequest = preRequest;
            return this;
        }
        public java.util.List<GetEgressProxyRuleGroupAttributeResponseBodyEgressProxyRulesPreRequest> getPreRequest() {
            return this.preRequest;
        }

    }

    public static class GetEgressProxyRuleGroupAttributeResponseBodyTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>epg</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEgressProxyRuleGroupAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetEgressProxyRuleGroupAttributeResponseBodyTags self = new GetEgressProxyRuleGroupAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetEgressProxyRuleGroupAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
