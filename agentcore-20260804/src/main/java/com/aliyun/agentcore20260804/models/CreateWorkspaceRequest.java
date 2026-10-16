// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    /**
     * <p>The workspace creation request body.</p>
     */
    @NameInMap("body")
    public CreateWorkspaceRequestBody body;

    /**
     * <p>The client idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-create-20260805-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setBody(CreateWorkspaceRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkspaceRequestBody getBody() {
        return this.body;
    }

    public CreateWorkspaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateWorkspaceRequestBodyNetworkConfigurationVpc extends TeaModel {
        /**
         * <p>Specifies whether to enable the VPC network.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of vSwitch IDs. When the VPC network is enabled, the list must contain at least one vSwitch, and all vSwitches must belong to the VPC specified by VpcId.</p>
         */
        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The user VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1234567890</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static CreateWorkspaceRequestBodyNetworkConfigurationVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceRequestBodyNetworkConfigurationVpc self = new CreateWorkspaceRequestBodyNetworkConfigurationVpc();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceRequestBodyNetworkConfigurationVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateWorkspaceRequestBodyNetworkConfigurationVpc setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateWorkspaceRequestBodyNetworkConfigurationVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateWorkspaceRequestBodyNetworkConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to allow public outbound access from the platform. If this parameter is not specified, the default value is true. This setting only controls whether the latest versions of managed and custom agents use the public outbound endpoint of the platform. It does not affect fixed historical versions, model or MCP proxy endpoints, or the public outbound endpoint of the user VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("publicEgressEnabled")
        public Boolean publicEgressEnabled;

        /**
         * <p>Specifies whether to allow public inbound access. If this parameter is not specified, the default value is true. If disabled, the public inbound endpoints of all agent endpoints in the workspace are closed, and the original public inbound endpoints are restored when re-enabled. INNER_DIRECT and user VPC endpoints are not affected. Collaboration and Element Web endpoints are not controlled by this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("publicIngressEnabled")
        public Boolean publicIngressEnabled;

        /**
         * <p>The user VPC network configuration.</p>
         */
        @NameInMap("vpc")
        public CreateWorkspaceRequestBodyNetworkConfigurationVpc vpc;

        public static CreateWorkspaceRequestBodyNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceRequestBodyNetworkConfiguration self = new CreateWorkspaceRequestBodyNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceRequestBodyNetworkConfiguration setPublicEgressEnabled(Boolean publicEgressEnabled) {
            this.publicEgressEnabled = publicEgressEnabled;
            return this;
        }
        public Boolean getPublicEgressEnabled() {
            return this.publicEgressEnabled;
        }

        public CreateWorkspaceRequestBodyNetworkConfiguration setPublicIngressEnabled(Boolean publicIngressEnabled) {
            this.publicIngressEnabled = publicIngressEnabled;
            return this;
        }
        public Boolean getPublicIngressEnabled() {
            return this.publicIngressEnabled;
        }

        public CreateWorkspaceRequestBodyNetworkConfiguration setVpc(CreateWorkspaceRequestBodyNetworkConfigurationVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public CreateWorkspaceRequestBodyNetworkConfigurationVpc getVpc() {
            return this.vpc;
        }

    }

    public static class CreateWorkspaceRequestBody extends TeaModel {
        /**
         * <p>The name of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>production-agents</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network configuration of the workspace.</p>
         */
        @NameInMap("networkConfiguration")
        public CreateWorkspaceRequestBodyNetworkConfiguration networkConfiguration;

        /**
         * <p>The workspace storage type. PLATFORM indicates platform-managed storage, and PRIVATE indicates user private OSS storage.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("storageType")
        public String storageType;

        public static CreateWorkspaceRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceRequestBody self = new CreateWorkspaceRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkspaceRequestBody setNetworkConfiguration(CreateWorkspaceRequestBodyNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public CreateWorkspaceRequestBodyNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public CreateWorkspaceRequestBody setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
