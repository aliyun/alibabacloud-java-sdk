// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetWorkspacePluginResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The plug-in details.</p>
     */
    @NameInMap("data")
    public GetWorkspacePluginResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message. An error description is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetWorkspacePluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspacePluginResponseBody self = new GetWorkspacePluginResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspacePluginResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkspacePluginResponseBody setData(GetWorkspacePluginResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkspacePluginResponseBodyData getData() {
        return this.data;
    }

    public GetWorkspacePluginResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWorkspacePluginResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkspacePluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspacePluginResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkspacePluginResponseBodyDataConfigAgentLoop extends TeaModel {
        /**
         * <p>The AgentSpace name associated with the AgentLoop plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>agentcore-ws-123456</p>
         */
        @NameInMap("agentSpaceName")
        public String agentSpaceName;

        /**
         * <p>The creation time of the AgentSpace in UTC in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The region ID where the AgentSpace resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static GetWorkspacePluginResponseBodyDataConfigAgentLoop build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspacePluginResponseBodyDataConfigAgentLoop self = new GetWorkspacePluginResponseBodyDataConfigAgentLoop();
            return TeaModel.build(map, self);
        }

        public GetWorkspacePluginResponseBodyDataConfigAgentLoop setAgentSpaceName(String agentSpaceName) {
            this.agentSpaceName = agentSpaceName;
            return this;
        }
        public String getAgentSpaceName() {
            return this.agentSpaceName;
        }

        public GetWorkspacePluginResponseBodyDataConfigAgentLoop setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetWorkspacePluginResponseBodyDataConfigAgentLoop setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetWorkspacePluginResponseBodyDataConfigNetworkInternet extends TeaModel {
        /**
         * <p>Indicates whether public network access is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static GetWorkspacePluginResponseBodyDataConfigNetworkInternet build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspacePluginResponseBodyDataConfigNetworkInternet self = new GetWorkspacePluginResponseBodyDataConfigNetworkInternet();
            return TeaModel.build(map, self);
        }

        public GetWorkspacePluginResponseBodyDataConfigNetworkInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetWorkspacePluginResponseBodyDataConfigNetworkVpc extends TeaModel {
        /**
         * <p>Indicates whether VPC network access is enabled for the collaboration plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of vSwitch IDs used for plug-in deployment.</p>
         */
        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The VPC ID used for plug-in deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1example</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static GetWorkspacePluginResponseBodyDataConfigNetworkVpc build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspacePluginResponseBodyDataConfigNetworkVpc self = new GetWorkspacePluginResponseBodyDataConfigNetworkVpc();
            return TeaModel.build(map, self);
        }

        public GetWorkspacePluginResponseBodyDataConfigNetworkVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetWorkspacePluginResponseBodyDataConfigNetworkVpc setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetWorkspacePluginResponseBodyDataConfigNetworkVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetWorkspacePluginResponseBodyDataConfigNetwork extends TeaModel {
        /**
         * <p>The public network access configuration.</p>
         */
        @NameInMap("internet")
        public GetWorkspacePluginResponseBodyDataConfigNetworkInternet internet;

        /**
         * <p>The user VPC configuration.</p>
         */
        @NameInMap("vpc")
        public GetWorkspacePluginResponseBodyDataConfigNetworkVpc vpc;

        public static GetWorkspacePluginResponseBodyDataConfigNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspacePluginResponseBodyDataConfigNetwork self = new GetWorkspacePluginResponseBodyDataConfigNetwork();
            return TeaModel.build(map, self);
        }

        public GetWorkspacePluginResponseBodyDataConfigNetwork setInternet(GetWorkspacePluginResponseBodyDataConfigNetworkInternet internet) {
            this.internet = internet;
            return this;
        }
        public GetWorkspacePluginResponseBodyDataConfigNetworkInternet getInternet() {
            return this.internet;
        }

        public GetWorkspacePluginResponseBodyDataConfigNetwork setVpc(GetWorkspacePluginResponseBodyDataConfigNetworkVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public GetWorkspacePluginResponseBodyDataConfigNetworkVpc getVpc() {
            return this.vpc;
        }

    }

    public static class GetWorkspacePluginResponseBodyDataConfig extends TeaModel {
        /**
         * <p>The AgentLoop plug-in configuration.</p>
         */
        @NameInMap("agentLoop")
        public GetWorkspacePluginResponseBodyDataConfigAgentLoop agentLoop;

        /**
         * <p>The network configuration of the plug-in, including public network access configuration and VPC configuration.</p>
         */
        @NameInMap("network")
        public GetWorkspacePluginResponseBodyDataConfigNetwork network;

        public static GetWorkspacePluginResponseBodyDataConfig build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspacePluginResponseBodyDataConfig self = new GetWorkspacePluginResponseBodyDataConfig();
            return TeaModel.build(map, self);
        }

        public GetWorkspacePluginResponseBodyDataConfig setAgentLoop(GetWorkspacePluginResponseBodyDataConfigAgentLoop agentLoop) {
            this.agentLoop = agentLoop;
            return this;
        }
        public GetWorkspacePluginResponseBodyDataConfigAgentLoop getAgentLoop() {
            return this.agentLoop;
        }

        public GetWorkspacePluginResponseBodyDataConfig setNetwork(GetWorkspacePluginResponseBodyDataConfigNetwork network) {
            this.network = network;
            return this;
        }
        public GetWorkspacePluginResponseBodyDataConfigNetwork getNetwork() {
            return this.network;
        }

    }

    public static class GetWorkspacePluginResponseBodyData extends TeaModel {
        /**
         * <p>The user-configurable properties currently in effect for the plug-in. This field is empty if the plug-in is not installed.</p>
         */
        @NameInMap("config")
        public GetWorkspacePluginResponseBodyDataConfig config;

        /**
         * <p>Indicates whether the plug-in is enabled. The value is true when the status is ENABLED.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The plug-in name.</p>
         * 
         * <strong>example:</strong>
         * <p>collaboration</p>
         */
        @NameInMap("pluginName")
        public String pluginName;

        /**
         * <p>The plug-in status. Valid values: DISABLED, ENABLING, ENABLED, ENABLE_FAILED, DISABLING, DISABLE_FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetWorkspacePluginResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspacePluginResponseBodyData self = new GetWorkspacePluginResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkspacePluginResponseBodyData setConfig(GetWorkspacePluginResponseBodyDataConfig config) {
            this.config = config;
            return this;
        }
        public GetWorkspacePluginResponseBodyDataConfig getConfig() {
            return this.config;
        }

        public GetWorkspacePluginResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetWorkspacePluginResponseBodyData setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public GetWorkspacePluginResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkspacePluginResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
