// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateIntegrationPolicyRequest extends TeaModel {
    @NameInMap("entityGroup")
    public CreateIntegrationPolicyRequestEntityGroup entityGroup;

    /**
     * <strong>example:</strong>
     * <p>prod-database</p>
     */
    @NameInMap("policyName")
    public String policyName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CS</p>
     */
    @NameInMap("policyType")
    public String policyType;

    /**
     * <strong>example:</strong>
     * <p>rg-aekz2km4kmhtbii</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("tags")
    public java.util.List<CreateIntegrationPolicyRequestTags> tags;

    /**
     * <strong>example:</strong>
     * <p>prometheus</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreateIntegrationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntegrationPolicyRequest self = new CreateIntegrationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntegrationPolicyRequest setEntityGroup(CreateIntegrationPolicyRequestEntityGroup entityGroup) {
        this.entityGroup = entityGroup;
        return this;
    }
    public CreateIntegrationPolicyRequestEntityGroup getEntityGroup() {
        return this.entityGroup;
    }

    public CreateIntegrationPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreateIntegrationPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public CreateIntegrationPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateIntegrationPolicyRequest setTags(java.util.List<CreateIntegrationPolicyRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateIntegrationPolicyRequestTags> getTags() {
        return this.tags;
    }

    public CreateIntegrationPolicyRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class CreateIntegrationPolicyRequestEntityGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acs.ack.cluster</p>
         */
        @NameInMap("clusterEntityType")
        public String clusterEntityType;

        /**
         * <strong>example:</strong>
         * <p>na61prod3-na61cloudhdfsssd</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("disablePolicyShare")
        public Boolean disablePolicyShare;

        /**
         * <strong>example:</strong>
         * <p>eg-b79f65d11fb94e779867cf937c3a3002</p>
         */
        @NameInMap("entityGroupId")
        public String entityGroupId;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp18fgg3ffxa9czna40xt</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static CreateIntegrationPolicyRequestEntityGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateIntegrationPolicyRequestEntityGroup self = new CreateIntegrationPolicyRequestEntityGroup();
            return TeaModel.build(map, self);
        }

        public CreateIntegrationPolicyRequestEntityGroup setClusterEntityType(String clusterEntityType) {
            this.clusterEntityType = clusterEntityType;
            return this;
        }
        public String getClusterEntityType() {
            return this.clusterEntityType;
        }

        public CreateIntegrationPolicyRequestEntityGroup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateIntegrationPolicyRequestEntityGroup setDisablePolicyShare(Boolean disablePolicyShare) {
            this.disablePolicyShare = disablePolicyShare;
            return this;
        }
        public Boolean getDisablePolicyShare() {
            return this.disablePolicyShare;
        }

        public CreateIntegrationPolicyRequestEntityGroup setEntityGroupId(String entityGroupId) {
            this.entityGroupId = entityGroupId;
            return this;
        }
        public String getEntityGroupId() {
            return this.entityGroupId;
        }

        public CreateIntegrationPolicyRequestEntityGroup setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateIntegrationPolicyRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>use</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateIntegrationPolicyRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateIntegrationPolicyRequestTags self = new CreateIntegrationPolicyRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateIntegrationPolicyRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateIntegrationPolicyRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
