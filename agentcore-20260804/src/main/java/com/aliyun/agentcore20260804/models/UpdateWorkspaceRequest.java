// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRequest extends TeaModel {
    /**
     * <p>The request body for updating a workspace.</p>
     */
    @NameInMap("body")
    public UpdateWorkspaceRequestBody body;

    /**
     * <p>The client token used to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-update-20260805-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceRequest self = new UpdateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceRequest setBody(UpdateWorkspaceRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceRequestBody getBody() {
        return this.body;
    }

    public UpdateWorkspaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateWorkspaceRequestBodyNetworkConfigurationVpc extends TeaModel {
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
         * <p>The ID of the user VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1234567890</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static UpdateWorkspaceRequestBodyNetworkConfigurationVpc build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceRequestBodyNetworkConfigurationVpc self = new UpdateWorkspaceRequestBodyNetworkConfigurationVpc();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceRequestBodyNetworkConfigurationVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateWorkspaceRequestBodyNetworkConfigurationVpc setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateWorkspaceRequestBodyNetworkConfigurationVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateWorkspaceRequestBodyNetworkConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to allow public egress access from the platform. If this parameter is not specified, the original value is retained. Disabling this feature asynchronously cascades to disable the public network switch for agents. Re-enabling this feature does not automatically restore the agent switch. This parameter only controls whether the latest versions of managed and custom agents use the public egress of the platform. It does not control fixed historical versions, model or MCP proxy egress, or the public egress of the user VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("publicEgressEnabled")
        public Boolean publicEgressEnabled;

        /**
         * <p>Specifies whether to allow public ingress access. If this parameter is not specified, the original value is retained. This parameter can be modified together with PublicEgressEnabled and takes effect asynchronously through a unified task. After this feature is disabled, the public ingress for all agent endpoints in the workspace is closed. After this feature is re-enabled, the original public ingress is restored. INNER_DIRECT and user VPC ingress are not affected. Collaboration and Element Web ingress are not controlled by this parameter.</p>
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
        public UpdateWorkspaceRequestBodyNetworkConfigurationVpc vpc;

        public static UpdateWorkspaceRequestBodyNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceRequestBodyNetworkConfiguration self = new UpdateWorkspaceRequestBodyNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceRequestBodyNetworkConfiguration setPublicEgressEnabled(Boolean publicEgressEnabled) {
            this.publicEgressEnabled = publicEgressEnabled;
            return this;
        }
        public Boolean getPublicEgressEnabled() {
            return this.publicEgressEnabled;
        }

        public UpdateWorkspaceRequestBodyNetworkConfiguration setPublicIngressEnabled(Boolean publicIngressEnabled) {
            this.publicIngressEnabled = publicIngressEnabled;
            return this;
        }
        public Boolean getPublicIngressEnabled() {
            return this.publicIngressEnabled;
        }

        public UpdateWorkspaceRequestBodyNetworkConfiguration setVpc(UpdateWorkspaceRequestBodyNetworkConfigurationVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public UpdateWorkspaceRequestBodyNetworkConfigurationVpc getVpc() {
            return this.vpc;
        }

    }

    public static class UpdateWorkspaceRequestBody extends TeaModel {
        /**
         * <p>The updated name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>production-agents-v2</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The updated network configuration of the workspace.</p>
         */
        @NameInMap("networkConfiguration")
        public UpdateWorkspaceRequestBodyNetworkConfiguration networkConfiguration;

        public static UpdateWorkspaceRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceRequestBody self = new UpdateWorkspaceRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkspaceRequestBody setNetworkConfiguration(UpdateWorkspaceRequestBodyNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public UpdateWorkspaceRequestBodyNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

    }

}
