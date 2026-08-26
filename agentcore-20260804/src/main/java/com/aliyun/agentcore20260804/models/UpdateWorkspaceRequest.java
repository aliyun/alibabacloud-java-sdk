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
     * <p>The client idempotency token.</p>
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
         * <p>Specifies whether to enable VPC networking.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of vSwitch IDs. When VPC networking is enabled, at least one vSwitch must be included, and all vSwitches must belong to the VPC specified by VpcId.</p>
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
         * <p>The user VPC network configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("vpc")
        public UpdateWorkspaceRequestBodyNetworkConfigurationVpc vpc;

        public static UpdateWorkspaceRequestBodyNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceRequestBodyNetworkConfiguration self = new UpdateWorkspaceRequestBodyNetworkConfiguration();
            return TeaModel.build(map, self);
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
         * <p>The updated workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>production-agents-v2</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The updated workspace network configuration.</p>
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
