// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetIntegrationPolicyResponseBody extends TeaModel {
    /**
     * <p>The integration policy.</p>
     */
    @NameInMap("policy")
    public GetIntegrationPolicyResponseBodyPolicy policy;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetIntegrationPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationPolicyResponseBody self = new GetIntegrationPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntegrationPolicyResponseBody setPolicy(GetIntegrationPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public GetIntegrationPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public GetIntegrationPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIntegrationPolicyResponseBodyPolicyBindResource extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>00b1630f02814f95a9bce717d8d56bb2</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <p>The cluster type.</p>
         * 
         * <strong>example:</strong>
         * <p>ManagedKubernetes</p>
         */
        @NameInMap("clusterType")
        public String clusterType;

        /**
         * <p>The CIDR block of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>10.12.0.1/16</p>
         */
        @NameInMap("vpcCidr")
        public String vpcCidr;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zegqpeyxplhtmdg70xnr</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static GetIntegrationPolicyResponseBodyPolicyBindResource build(java.util.Map<String, ?> map) throws Exception {
            GetIntegrationPolicyResponseBodyPolicyBindResource self = new GetIntegrationPolicyResponseBodyPolicyBindResource();
            return TeaModel.build(map, self);
        }

        public GetIntegrationPolicyResponseBodyPolicyBindResource setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetIntegrationPolicyResponseBodyPolicyBindResource setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public GetIntegrationPolicyResponseBodyPolicyBindResource setVpcCidr(String vpcCidr) {
            this.vpcCidr = vpcCidr;
            return this;
        }
        public String getVpcCidr() {
            return this.vpcCidr;
        }

        public GetIntegrationPolicyResponseBodyPolicyBindResource setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesAnnotations extends TeaModel {
        /**
         * <p>The operation to perform.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>use</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag values.</p>
         */
        @NameInMap("tagValues")
        public java.util.List<String> tagValues;

        public static GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesAnnotations build(java.util.Map<String, ?> map) throws Exception {
            GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesAnnotations self = new GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesAnnotations();
            return TeaModel.build(map, self);
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesAnnotations setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesAnnotations setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesAnnotations setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

    public static class GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesFieldRules extends TeaModel {
        /**
         * <p>The unique identifier of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("fieldKey")
        public String fieldKey;

        /**
         * <p>The field content.</p>
         */
        @NameInMap("fieldValues")
        public java.util.List<String> fieldValues;

        /**
         * <p>The operation to perform.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("op")
        public String op;

        public static GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesFieldRules build(java.util.Map<String, ?> map) throws Exception {
            GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesFieldRules self = new GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesFieldRules();
            return TeaModel.build(map, self);
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesFieldRules setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesFieldRules setFieldValues(java.util.List<String> fieldValues) {
            this.fieldValues = fieldValues;
            return this;
        }
        public java.util.List<String> getFieldValues() {
            return this.fieldValues;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesFieldRules setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

    }

    public static class GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesIpMatchRule extends TeaModel {
        /**
         * <p>The IP address CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.0.1/16</p>
         */
        @NameInMap("ipCidr")
        public String ipCidr;

        /**
         * <p>The key of the IP address field.</p>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("ipFieldKey")
        public String ipFieldKey;

        public static GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesIpMatchRule build(java.util.Map<String, ?> map) throws Exception {
            GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesIpMatchRule self = new GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesIpMatchRule();
            return TeaModel.build(map, self);
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesIpMatchRule setIpCidr(String ipCidr) {
            this.ipCidr = ipCidr;
            return this;
        }
        public String getIpCidr() {
            return this.ipCidr;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesIpMatchRule setIpFieldKey(String ipFieldKey) {
            this.ipFieldKey = ipFieldKey;
            return this;
        }
        public String getIpFieldKey() {
            return this.ipFieldKey;
        }

    }

    public static class GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesLabels extends TeaModel {
        /**
         * <p>The operation to perform.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>The tag key of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The list of tag values.</p>
         */
        @NameInMap("tagValues")
        public java.util.List<String> tagValues;

        public static GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesLabels build(java.util.Map<String, ?> map) throws Exception {
            GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesLabels self = new GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesLabels();
            return TeaModel.build(map, self);
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesLabels setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesLabels setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesLabels setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

    public static class GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesTags extends TeaModel {
        /**
         * <p>The operation to perform.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("op")
        public String op;

        /**
         * <p>The tag key of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>key2</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The list of tag values.</p>
         */
        @NameInMap("tagValues")
        public java.util.List<String> tagValues;

        public static GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesTags build(java.util.Map<String, ?> map) throws Exception {
            GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesTags self = new GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesTags();
            return TeaModel.build(map, self);
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesTags setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesTags setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

    public static class GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules extends TeaModel {
        /**
         * <p>The comments.</p>
         */
        @NameInMap("annotations")
        public java.util.List<GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesAnnotations> annotations;

        /**
         * <p>The list of entity types.</p>
         */
        @NameInMap("entityTypes")
        public java.util.List<String> entityTypes;

        /**
         * <p>The list of property rules.</p>
         */
        @NameInMap("fieldRules")
        public java.util.List<GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesFieldRules> fieldRules;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("instanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The IP address matching rule.</p>
         */
        @NameInMap("ipMatchRule")
        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesIpMatchRule ipMatchRule;

        /**
         * <p>The labels.</p>
         */
        @NameInMap("labels")
        public java.util.List<GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesLabels> labels;

        /**
         * <p>The list of region IDs.</p>
         */
        @NameInMap("regionIds")
        public java.util.List<String> regionIds;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek3aqsuvlv3yyq</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesTags> tags;

        public static GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules build(java.util.Map<String, ?> map) throws Exception {
            GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules self = new GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules();
            return TeaModel.build(map, self);
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules setAnnotations(java.util.List<GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesAnnotations> getAnnotations() {
            return this.annotations;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules setEntityTypes(java.util.List<String> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }
        public java.util.List<String> getEntityTypes() {
            return this.entityTypes;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules setFieldRules(java.util.List<GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesFieldRules> fieldRules) {
            this.fieldRules = fieldRules;
            return this;
        }
        public java.util.List<GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesFieldRules> getFieldRules() {
            return this.fieldRules;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules setIpMatchRule(GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesIpMatchRule ipMatchRule) {
            this.ipMatchRule = ipMatchRule;
            return this;
        }
        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesIpMatchRule getIpMatchRule() {
            return this.ipMatchRule;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules setLabels(java.util.List<GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesLabels> getLabels() {
            return this.labels;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules setRegionIds(java.util.List<String> regionIds) {
            this.regionIds = regionIds;
            return this;
        }
        public java.util.List<String> getRegionIds() {
            return this.regionIds;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules setTags(java.util.List<GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRulesTags> getTags() {
            return this.tags;
        }

    }

    public static class GetIntegrationPolicyResponseBodyPolicyEntityGroup extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The entity group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eg-b79f65d11fb94e779867cf937c3a3002</p>
         */
        @NameInMap("entityGroupId")
        public String entityGroupId;

        /**
         * <p>The entity group name.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-database</p>
         */
        @NameInMap("entityGroupName")
        public String entityGroupName;

        /**
         * <p>The entity rules.</p>
         */
        @NameInMap("entityRules")
        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules entityRules;

        /**
         * <p>The query condition.</p>
         * 
         * <strong>example:</strong>
         * <p>status: 200 AND totalTime &gt; 0.5</p>
         */
        @NameInMap("query")
        public String query;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>u123456</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-api</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static GetIntegrationPolicyResponseBodyPolicyEntityGroup build(java.util.Map<String, ?> map) throws Exception {
            GetIntegrationPolicyResponseBodyPolicyEntityGroup self = new GetIntegrationPolicyResponseBodyPolicyEntityGroup();
            return TeaModel.build(map, self);
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroup setEntityGroupId(String entityGroupId) {
            this.entityGroupId = entityGroupId;
            return this;
        }
        public String getEntityGroupId() {
            return this.entityGroupId;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroup setEntityGroupName(String entityGroupName) {
            this.entityGroupName = entityGroupName;
            return this;
        }
        public String getEntityGroupName() {
            return this.entityGroupName;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroup setEntityRules(GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules entityRules) {
            this.entityRules = entityRules;
            return this;
        }
        public GetIntegrationPolicyResponseBodyPolicyEntityGroupEntityRules getEntityRules() {
            return this.entityRules;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroup setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroup setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetIntegrationPolicyResponseBodyPolicyEntityGroup setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class GetIntegrationPolicyResponseBodyPolicyManagedInfo extends TeaModel {
        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxxxx</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxxxxxx</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        public static GetIntegrationPolicyResponseBodyPolicyManagedInfo build(java.util.Map<String, ?> map) throws Exception {
            GetIntegrationPolicyResponseBodyPolicyManagedInfo self = new GetIntegrationPolicyResponseBodyPolicyManagedInfo();
            return TeaModel.build(map, self);
        }

        public GetIntegrationPolicyResponseBodyPolicyManagedInfo setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetIntegrationPolicyResponseBodyPolicyManagedInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class GetIntegrationPolicyResponseBodyPolicyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>use</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        @NameInMap("value")
        public String value;

        public static GetIntegrationPolicyResponseBodyPolicyTags build(java.util.Map<String, ?> map) throws Exception {
            GetIntegrationPolicyResponseBodyPolicyTags self = new GetIntegrationPolicyResponseBodyPolicyTags();
            return TeaModel.build(map, self);
        }

        public GetIntegrationPolicyResponseBodyPolicyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetIntegrationPolicyResponseBodyPolicyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetIntegrationPolicyResponseBodyPolicy extends TeaModel {
        /**
         * <p>The information about the attached resource.</p>
         */
        @NameInMap("bindResource")
        public GetIntegrationPolicyResponseBodyPolicyBindResource bindResource;

        /**
         * <p>The installation status of umodel in the container environment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("csUmodelStatus")
        public Boolean csUmodelStatus;

        /**
         * <p>The entity group.</p>
         */
        @NameInMap("entityGroup")
        public GetIntegrationPolicyResponseBodyPolicyEntityGroup entityGroup;

        /**
         * <p>The policy management information.</p>
         */
        @NameInMap("managedInfo")
        public GetIntegrationPolicyResponseBodyPolicyManagedInfo managedInfo;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-c9efed2b99c348d49e589c5f780fc074</p>
         */
        @NameInMap("policyId")
        public String policyId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>ControlPolicy4DetailVportInfo</p>
         */
        @NameInMap("policyName")
        public String policyName;

        /**
         * <p>The type of the integration policy.</p>
         * 
         * <strong>example:</strong>
         * <p>CS</p>
         */
        @NameInMap("policyType")
        public String policyType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxxx</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<GetIntegrationPolicyResponseBodyPolicyTags> tags;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>u123456</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>prometheus</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static GetIntegrationPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetIntegrationPolicyResponseBodyPolicy self = new GetIntegrationPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public GetIntegrationPolicyResponseBodyPolicy setBindResource(GetIntegrationPolicyResponseBodyPolicyBindResource bindResource) {
            this.bindResource = bindResource;
            return this;
        }
        public GetIntegrationPolicyResponseBodyPolicyBindResource getBindResource() {
            return this.bindResource;
        }

        public GetIntegrationPolicyResponseBodyPolicy setCsUmodelStatus(Boolean csUmodelStatus) {
            this.csUmodelStatus = csUmodelStatus;
            return this;
        }
        public Boolean getCsUmodelStatus() {
            return this.csUmodelStatus;
        }

        public GetIntegrationPolicyResponseBodyPolicy setEntityGroup(GetIntegrationPolicyResponseBodyPolicyEntityGroup entityGroup) {
            this.entityGroup = entityGroup;
            return this;
        }
        public GetIntegrationPolicyResponseBodyPolicyEntityGroup getEntityGroup() {
            return this.entityGroup;
        }

        public GetIntegrationPolicyResponseBodyPolicy setManagedInfo(GetIntegrationPolicyResponseBodyPolicyManagedInfo managedInfo) {
            this.managedInfo = managedInfo;
            return this;
        }
        public GetIntegrationPolicyResponseBodyPolicyManagedInfo getManagedInfo() {
            return this.managedInfo;
        }

        public GetIntegrationPolicyResponseBodyPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetIntegrationPolicyResponseBodyPolicy setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetIntegrationPolicyResponseBodyPolicy setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public GetIntegrationPolicyResponseBodyPolicy setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetIntegrationPolicyResponseBodyPolicy setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetIntegrationPolicyResponseBodyPolicy setTags(java.util.List<GetIntegrationPolicyResponseBodyPolicyTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetIntegrationPolicyResponseBodyPolicyTags> getTags() {
            return this.tags;
        }

        public GetIntegrationPolicyResponseBodyPolicy setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetIntegrationPolicyResponseBodyPolicy setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
