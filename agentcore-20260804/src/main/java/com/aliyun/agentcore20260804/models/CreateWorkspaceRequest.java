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
         * <p>The ID of the VPC.</p>
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
         * <p>The VPC network configuration of the user.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("vpc")
        public CreateWorkspaceRequestBodyNetworkConfigurationVpc vpc;

        public static CreateWorkspaceRequestBodyNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceRequestBodyNetworkConfiguration self = new CreateWorkspaceRequestBodyNetworkConfiguration();
            return TeaModel.build(map, self);
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
         * <p>The workspace name.</p>
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

    }

}
