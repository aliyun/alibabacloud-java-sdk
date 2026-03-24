// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPoliciesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.
     * Default value:
     * 50
     * Maximum value:
     * 50</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>44ANBjKZmQeKnaB1fXRq06w7sFYK3MUcCALMD9qQbmEiE</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>A list of integration policies.</p>
     */
    @NameInMap("policies")
    public java.util.List<ListIntegrationPoliciesResponseBodyPolicies> policies;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CD8BA7D6-995D-578D-9941-78B0FECD14B5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListIntegrationPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPoliciesResponseBody self = new ListIntegrationPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPoliciesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIntegrationPoliciesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIntegrationPoliciesResponseBody setPolicies(java.util.List<ListIntegrationPoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<ListIntegrationPoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public ListIntegrationPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIntegrationPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIntegrationPoliciesResponseBodyPoliciesBindResource extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cv68tt87d78vyc89zy9v</p>
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
         * <p>100.100.0.1/16</p>
         */
        @NameInMap("vpcCidr")
        public String vpcCidr;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf664nyle5khp5d4d7hdo</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListIntegrationPoliciesResponseBodyPoliciesBindResource build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPoliciesResponseBodyPoliciesBindResource self = new ListIntegrationPoliciesResponseBodyPoliciesBindResource();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPoliciesResponseBodyPoliciesBindResource setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesBindResource setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesBindResource setVpcCidr(String vpcCidr) {
            this.vpcCidr = vpcCidr;
            return this;
        }
        public String getVpcCidr() {
            return this.vpcCidr;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesBindResource setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesAnnotations extends TeaModel {
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
         * <p>key</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag values.</p>
         */
        @NameInMap("tagValues")
        public java.util.List<String> tagValues;

        public static ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesAnnotations build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesAnnotations self = new ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesAnnotations();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesAnnotations setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesAnnotations setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesAnnotations setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

    public static class ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesFieldRules extends TeaModel {
        /**
         * <p>The unique identifier of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("fieldKey")
        public String fieldKey;

        /**
         * <p>The content of the field. Separate multiple values with commas.</p>
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

        public static ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesFieldRules build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesFieldRules self = new ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesFieldRules();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesFieldRules setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesFieldRules setFieldValues(java.util.List<String> fieldValues) {
            this.fieldValues = fieldValues;
            return this;
        }
        public java.util.List<String> getFieldValues() {
            return this.fieldValues;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesFieldRules setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

    }

    public static class ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesIpMatchRule extends TeaModel {
        /**
         * <p>The IP address CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>100.100.1.0/16</p>
         */
        @NameInMap("ipCidr")
        public String ipCidr;

        /**
         * <p>The key of the IP address field.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("ipFieldKey")
        public String ipFieldKey;

        public static ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesIpMatchRule build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesIpMatchRule self = new ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesIpMatchRule();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesIpMatchRule setIpCidr(String ipCidr) {
            this.ipCidr = ipCidr;
            return this;
        }
        public String getIpCidr() {
            return this.ipCidr;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesIpMatchRule setIpFieldKey(String ipFieldKey) {
            this.ipFieldKey = ipFieldKey;
            return this;
        }
        public String getIpFieldKey() {
            return this.ipFieldKey;
        }

    }

    public static class ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesLabels extends TeaModel {
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
         * <p>test</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag values.</p>
         */
        @NameInMap("tagValues")
        public java.util.List<String> tagValues;

        public static ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesLabels build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesLabels self = new ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesLabels();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesLabels setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesLabels setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesLabels setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

    public static class ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesTags extends TeaModel {
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
         * <p>key</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag values.</p>
         */
        @NameInMap("tagValues")
        public java.util.List<String> tagValues;

        public static ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesTags build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesTags self = new ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesTags();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesTags setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesTags setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

    public static class ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules extends TeaModel {
        /**
         * <p>The annotations.</p>
         */
        @NameInMap("annotations")
        public java.util.List<ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesAnnotations> annotations;

        /**
         * <p>A list of entity types.</p>
         */
        @NameInMap("entityTypes")
        public java.util.List<String> entityTypes;

        /**
         * <p>The field rules.</p>
         */
        @NameInMap("fieldRules")
        public java.util.List<ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesFieldRules> fieldRules;

        /**
         * <p>The instance IDs.</p>
         */
        @NameInMap("instanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The IP address matching rule.</p>
         */
        @NameInMap("ipMatchRule")
        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesIpMatchRule ipMatchRule;

        /**
         * <p>The labels.</p>
         */
        @NameInMap("labels")
        public java.util.List<ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesLabels> labels;

        /**
         * <p>A list of region IDs.</p>
         */
        @NameInMap("regionIds")
        public java.util.List<String> regionIds;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-5i6dbwxfxuqihk7k</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags of the instance.</p>
         */
        @NameInMap("tags")
        public java.util.List<ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesTags> tags;

        public static ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules self = new ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules setAnnotations(java.util.List<ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesAnnotations> getAnnotations() {
            return this.annotations;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules setEntityTypes(java.util.List<String> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }
        public java.util.List<String> getEntityTypes() {
            return this.entityTypes;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules setFieldRules(java.util.List<ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesFieldRules> fieldRules) {
            this.fieldRules = fieldRules;
            return this;
        }
        public java.util.List<ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesFieldRules> getFieldRules() {
            return this.fieldRules;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules setIpMatchRule(ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesIpMatchRule ipMatchRule) {
            this.ipMatchRule = ipMatchRule;
            return this;
        }
        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesIpMatchRule getIpMatchRule() {
            return this.ipMatchRule;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules setLabels(java.util.List<ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesLabels> getLabels() {
            return this.labels;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules setRegionIds(java.util.List<String> regionIds) {
            this.regionIds = regionIds;
            return this;
        }
        public java.util.List<String> getRegionIds() {
            return this.regionIds;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules setTags(java.util.List<ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRulesTags> getTags() {
            return this.tags;
        }

    }

    public static class ListIntegrationPoliciesResponseBodyPoliciesEntityGroup extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
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
         * <p>test-eg</p>
         */
        @NameInMap("entityGroupName")
        public String entityGroupName;

        /**
         * <p>The entity group.</p>
         */
        @NameInMap("entityRules")
        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules entityRules;

        /**
         * <p>The search keyword. You can search by entity group name and description.</p>
         * 
         * <strong>example:</strong>
         * <p>哈弗</p>
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
         * <p>1236812738</p>
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

        public static ListIntegrationPoliciesResponseBodyPoliciesEntityGroup build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPoliciesResponseBodyPoliciesEntityGroup self = new ListIntegrationPoliciesResponseBodyPoliciesEntityGroup();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroup setEntityGroupId(String entityGroupId) {
            this.entityGroupId = entityGroupId;
            return this;
        }
        public String getEntityGroupId() {
            return this.entityGroupId;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroup setEntityGroupName(String entityGroupName) {
            this.entityGroupName = entityGroupName;
            return this;
        }
        public String getEntityGroupName() {
            return this.entityGroupName;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroup setEntityRules(ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules entityRules) {
            this.entityRules = entityRules;
            return this;
        }
        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroupEntityRules getEntityRules() {
            return this.entityRules;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroup setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroup setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroup setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

    public static class ListIntegrationPoliciesResponseBodyPoliciesManagedInfo extends TeaModel {
        /**
         * <p>The ID of the elastic network interface (ENI) for the managed probe. For example, eni-xxxx.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-12345678</p>
         */
        @NameInMap("eniId")
        public String eniId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxxx</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxxx</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        public static ListIntegrationPoliciesResponseBodyPoliciesManagedInfo build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPoliciesResponseBodyPoliciesManagedInfo self = new ListIntegrationPoliciesResponseBodyPoliciesManagedInfo();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPoliciesResponseBodyPoliciesManagedInfo setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesManagedInfo setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesManagedInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class ListIntegrationPoliciesResponseBodyPoliciesSubAddonRelease extends TeaModel {
        /**
         * <p>The number of ready sub-releases.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ready")
        public Integer ready;

        /**
         * <p>The number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>278</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ListIntegrationPoliciesResponseBodyPoliciesSubAddonRelease build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPoliciesResponseBodyPoliciesSubAddonRelease self = new ListIntegrationPoliciesResponseBodyPoliciesSubAddonRelease();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPoliciesResponseBodyPoliciesSubAddonRelease setReady(Integer ready) {
            this.ready = ready;
            return this;
        }
        public Integer getReady() {
            return this.ready;
        }

        public ListIntegrationPoliciesResponseBodyPoliciesSubAddonRelease setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListIntegrationPoliciesResponseBodyPolicies extends TeaModel {
        /**
         * <p>The information about the attached resource.</p>
         */
        @NameInMap("bindResource")
        public ListIntegrationPoliciesResponseBodyPoliciesBindResource bindResource;

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
        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroup entityGroup;

        /**
         * <p>The billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>CS_Pro</p>
         */
        @NameInMap("feePackage")
        public String feePackage;

        /**
         * <p>The network management information of the policy.</p>
         */
        @NameInMap("managedInfo")
        public ListIntegrationPoliciesResponseBodyPoliciesManagedInfo managedInfo;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-ac38a7cb02d14ff48bc9f97d0a75063e</p>
         */
        @NameInMap("policyId")
        public String policyId;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>6f5HSsg3AP</p>
         */
        @NameInMap("policyName")
        public String policyName;

        /**
         * <p>The type of the Integration Center policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
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
         * <p>The number of sub-releases.</p>
         */
        @NameInMap("subAddonRelease")
        public ListIntegrationPoliciesResponseBodyPoliciesSubAddonRelease subAddonRelease;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>128470923</p>
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

        public static ListIntegrationPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPoliciesResponseBodyPolicies self = new ListIntegrationPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPoliciesResponseBodyPolicies setBindResource(ListIntegrationPoliciesResponseBodyPoliciesBindResource bindResource) {
            this.bindResource = bindResource;
            return this;
        }
        public ListIntegrationPoliciesResponseBodyPoliciesBindResource getBindResource() {
            return this.bindResource;
        }

        public ListIntegrationPoliciesResponseBodyPolicies setCsUmodelStatus(Boolean csUmodelStatus) {
            this.csUmodelStatus = csUmodelStatus;
            return this;
        }
        public Boolean getCsUmodelStatus() {
            return this.csUmodelStatus;
        }

        public ListIntegrationPoliciesResponseBodyPolicies setEntityGroup(ListIntegrationPoliciesResponseBodyPoliciesEntityGroup entityGroup) {
            this.entityGroup = entityGroup;
            return this;
        }
        public ListIntegrationPoliciesResponseBodyPoliciesEntityGroup getEntityGroup() {
            return this.entityGroup;
        }

        public ListIntegrationPoliciesResponseBodyPolicies setFeePackage(String feePackage) {
            this.feePackage = feePackage;
            return this;
        }
        public String getFeePackage() {
            return this.feePackage;
        }

        public ListIntegrationPoliciesResponseBodyPolicies setManagedInfo(ListIntegrationPoliciesResponseBodyPoliciesManagedInfo managedInfo) {
            this.managedInfo = managedInfo;
            return this;
        }
        public ListIntegrationPoliciesResponseBodyPoliciesManagedInfo getManagedInfo() {
            return this.managedInfo;
        }

        public ListIntegrationPoliciesResponseBodyPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListIntegrationPoliciesResponseBodyPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListIntegrationPoliciesResponseBodyPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListIntegrationPoliciesResponseBodyPolicies setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListIntegrationPoliciesResponseBodyPolicies setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListIntegrationPoliciesResponseBodyPolicies setSubAddonRelease(ListIntegrationPoliciesResponseBodyPoliciesSubAddonRelease subAddonRelease) {
            this.subAddonRelease = subAddonRelease;
            return this;
        }
        public ListIntegrationPoliciesResponseBodyPoliciesSubAddonRelease getSubAddonRelease() {
            return this.subAddonRelease;
        }

        public ListIntegrationPoliciesResponseBodyPolicies setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListIntegrationPoliciesResponseBodyPolicies setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
