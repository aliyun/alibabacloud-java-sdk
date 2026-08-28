// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class InstallWorkspacePluginRequest extends TeaModel {
    /**
     * <p>The request body for installing a plugin.</p>
     */
    @NameInMap("body")
    public InstallWorkspacePluginRequestBody body;

    /**
     * <p>The client idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-plugin-install-20260810-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static InstallWorkspacePluginRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallWorkspacePluginRequest self = new InstallWorkspacePluginRequest();
        return TeaModel.build(map, self);
    }

    public InstallWorkspacePluginRequest setBody(InstallWorkspacePluginRequestBody body) {
        this.body = body;
        return this;
    }
    public InstallWorkspacePluginRequestBody getBody() {
        return this.body;
    }

    public InstallWorkspacePluginRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class InstallWorkspacePluginRequestBodyConfigNetworkInternet extends TeaModel {
        /**
         * <p>Specifies whether to enable public network access. If set to true without a VPC specified, PUB_NET is used. If set to true with a VPC specified, PRIVATE_PUBNET is used. If only a VPC is specified, PRIVATE_NET is used. At least one of public network or VPC must be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static InstallWorkspacePluginRequestBodyConfigNetworkInternet build(java.util.Map<String, ?> map) throws Exception {
            InstallWorkspacePluginRequestBodyConfigNetworkInternet self = new InstallWorkspacePluginRequestBodyConfigNetworkInternet();
            return TeaModel.build(map, self);
        }

        public InstallWorkspacePluginRequestBodyConfigNetworkInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class InstallWorkspacePluginRequestBodyConfigNetworkVpc extends TeaModel {
        /**
         * <p>Specifies whether the collaboration plugin uses VPC networking. If set to false, vpcId and vSwitchIds are ignored. If set to true, you must provide both vpcId and at least two vSwitchIds.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of vSwitch IDs. The collaboration plugin requires that the vSwitches cover at least two different zones, and all vSwitches must belong to the VPC specified by vpcId.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The VPC ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1234567890</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static InstallWorkspacePluginRequestBodyConfigNetworkVpc build(java.util.Map<String, ?> map) throws Exception {
            InstallWorkspacePluginRequestBodyConfigNetworkVpc self = new InstallWorkspacePluginRequestBodyConfigNetworkVpc();
            return TeaModel.build(map, self);
        }

        public InstallWorkspacePluginRequestBodyConfigNetworkVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public InstallWorkspacePluginRequestBodyConfigNetworkVpc setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public InstallWorkspacePluginRequestBodyConfigNetworkVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class InstallWorkspacePluginRequestBodyConfigNetwork extends TeaModel {
        /**
         * <p>Controls whether the collaboration component is allowed to access the public network. This configuration only controls public network access capability and does not expose the component service to the public network.</p>
         */
        @NameInMap("internet")
        public InstallWorkspacePluginRequestBodyConfigNetworkInternet internet;

        /**
         * <p>The user VPC and vSwitch list used for deploying the collaboration plugin. The zones corresponding to the vSwitches are queried by the server and do not need to be provided by the user.</p>
         */
        @NameInMap("vpc")
        public InstallWorkspacePluginRequestBodyConfigNetworkVpc vpc;

        public static InstallWorkspacePluginRequestBodyConfigNetwork build(java.util.Map<String, ?> map) throws Exception {
            InstallWorkspacePluginRequestBodyConfigNetwork self = new InstallWorkspacePluginRequestBodyConfigNetwork();
            return TeaModel.build(map, self);
        }

        public InstallWorkspacePluginRequestBodyConfigNetwork setInternet(InstallWorkspacePluginRequestBodyConfigNetworkInternet internet) {
            this.internet = internet;
            return this;
        }
        public InstallWorkspacePluginRequestBodyConfigNetworkInternet getInternet() {
            return this.internet;
        }

        public InstallWorkspacePluginRequestBodyConfigNetwork setVpc(InstallWorkspacePluginRequestBodyConfigNetworkVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public InstallWorkspacePluginRequestBodyConfigNetworkVpc getVpc() {
            return this.vpc;
        }

    }

    public static class InstallWorkspacePluginRequestBodyConfig extends TeaModel {
        /**
         * <p>The network configuration used by the collaboration plugin. If not specified, the server uses the existing network configuration of the workspace.</p>
         */
        @NameInMap("network")
        public InstallWorkspacePluginRequestBodyConfigNetwork network;

        public static InstallWorkspacePluginRequestBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            InstallWorkspacePluginRequestBodyConfig self = new InstallWorkspacePluginRequestBodyConfig();
            return TeaModel.build(map, self);
        }

        public InstallWorkspacePluginRequestBodyConfig setNetwork(InstallWorkspacePluginRequestBodyConfigNetwork network) {
            this.network = network;
            return this;
        }
        public InstallWorkspacePluginRequestBodyConfigNetwork getNetwork() {
            return this.network;
        }

    }

    public static class InstallWorkspacePluginRequestBody extends TeaModel {
        /**
         * <p>The plugin-specific configuration. The configuration structure is determined by pluginName. Currently, the collaboration plugin supports network.</p>
         */
        @NameInMap("config")
        public InstallWorkspacePluginRequestBodyConfig config;

        public static InstallWorkspacePluginRequestBody build(java.util.Map<String, ?> map) throws Exception {
            InstallWorkspacePluginRequestBody self = new InstallWorkspacePluginRequestBody();
            return TeaModel.build(map, self);
        }

        public InstallWorkspacePluginRequestBody setConfig(InstallWorkspacePluginRequestBodyConfig config) {
            this.config = config;
            return this;
        }
        public InstallWorkspacePluginRequestBodyConfig getConfig() {
            return this.config;
        }

    }

}
