// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    /**
     * <p>The request body for creating a workspace.</p>
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
         * <p>The list of vSwitch IDs. If the VPC network is enabled, at least one vSwitch must be included, and all vSwitches must belong to the VPC specified by VpcId.</p>
         */
        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the user VPC.</p>
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
         * <p>Specifies whether to allow public outbound access from the platform. If not specified, the default value is true. This setting only controls whether the latest versions of managed and custom agents use the public outbound endpoint of the platform. It does not affect fixed historical versions, model or Model Context Protocol (MCP) proxy outbound endpoints, or the public outbound endpoint of the user VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("publicEgressEnabled")
        public Boolean publicEgressEnabled;

        /**
         * <p>Specifies whether to allow public inbound access. If not specified, the default value is true. If disabled, the public inbound endpoints of all agent endpoints in the workspace are closed. If re-enabled, the original public inbound endpoints are restored. INNER_DIRECT and user VPC inbound endpoints are not affected. Collaboration and Element Web inbound endpoints are not controlled by this setting.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("publicIngressEnabled")
        public Boolean publicIngressEnabled;

        /**
         * <p>The VPC network configuration of the user.</p>
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
         * <p>If specified, the workspace is directly bound to this AgentSpace without creating a new one. The associated CloudMonitor (CMS) workspace is determined by the server\&quot;s reverse lookup result, and CmsWorkspace validation is skipped. When the workspace is deleted, only the binding is removed, and the AgentSpace is not deleted. The value must match the current account and region, and the associated CMS workspace must be found through reverse lookup. Otherwise, InvalidParameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        @NameInMap("agentSpace")
        public String agentSpace;

        /**
         * <p>If specified, the workspace is bound to this CloudMonitor (CMS) workspace without creating a new one. When the workspace is deleted, only the binding is removed, and the CMS workspace is not deleted. The value must match the current account and region. Otherwise, InvalidParameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>my-cms-workspace</p>
         */
        @NameInMap("cmsWorkspace")
        public String cmsWorkspace;

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
         * <p>The storage type of the workspace. PLATFORM indicates platform-managed storage. PRIVATE indicates user-owned private Object Storage Service (OSS) storage.</p>
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

        public CreateWorkspaceRequestBody setAgentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }
        public String getAgentSpace() {
            return this.agentSpace;
        }

        public CreateWorkspaceRequestBody setCmsWorkspace(String cmsWorkspace) {
            this.cmsWorkspace = cmsWorkspace;
            return this;
        }
        public String getCmsWorkspace() {
            return this.cmsWorkspace;
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
