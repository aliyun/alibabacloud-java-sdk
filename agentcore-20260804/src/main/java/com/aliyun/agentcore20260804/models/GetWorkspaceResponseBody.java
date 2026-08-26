// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The workspace details.</p>
     */
    @NameInMap("data")
    public GetWorkspaceResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
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
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponseBody self = new GetWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkspaceResponseBody setData(GetWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public GetWorkspaceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkspaceResponseBodyDataNetworkConfigurationVpc extends TeaModel {
        /**
         * <p>Indicates whether the VPC network is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of vSwitch IDs.</p>
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

        public static GetWorkspaceResponseBodyDataNetworkConfigurationVpc build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyDataNetworkConfigurationVpc self = new GetWorkspaceResponseBodyDataNetworkConfigurationVpc();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyDataNetworkConfigurationVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetWorkspaceResponseBodyDataNetworkConfigurationVpc setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetWorkspaceResponseBodyDataNetworkConfigurationVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetWorkspaceResponseBodyDataNetworkConfiguration extends TeaModel {
        /**
         * <p>The user VPC network configuration.</p>
         */
        @NameInMap("vpc")
        public GetWorkspaceResponseBodyDataNetworkConfigurationVpc vpc;

        public static GetWorkspaceResponseBodyDataNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyDataNetworkConfiguration self = new GetWorkspaceResponseBodyDataNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyDataNetworkConfiguration setVpc(GetWorkspaceResponseBodyDataNetworkConfigurationVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public GetWorkspaceResponseBodyDataNetworkConfigurationVpc getVpc() {
            return this.vpc;
        }

    }

    public static class GetWorkspaceResponseBodyData extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-06T03:56:56Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>production-agents</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The workspace network configuration.</p>
         */
        @NameInMap("networkConfiguration")
        public GetWorkspaceResponseBodyDataNetworkConfiguration networkConfiguration;

        /**
         * <p>The region ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The workspace status. Valid values: Initializing, InitializationFailed, Initialized, Deleting, Deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>Initialized</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The reason for the workspace status.</p>
         * 
         * <strong>example:</strong>
         * <p>InitializationFailed: VPC not found</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <p>The ID of the tenant to which the workspace belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant-123456</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyData self = new GetWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetWorkspaceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkspaceResponseBodyData setNetworkConfiguration(GetWorkspaceResponseBodyDataNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public GetWorkspaceResponseBodyDataNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public GetWorkspaceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetWorkspaceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkspaceResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetWorkspaceResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetWorkspaceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
