// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The details of the updated workspace.</p>
     */
    @NameInMap("data")
    public UpdateWorkspaceResponseBodyData data;

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

    public static UpdateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceResponseBody self = new UpdateWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateWorkspaceResponseBody setData(UpdateWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public UpdateWorkspaceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateWorkspaceResponseBodyDataNetworkConfigurationVpc extends TeaModel {
        /**
         * <p>Specifies whether to enable VPC networking.</p>
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

        public static UpdateWorkspaceResponseBodyDataNetworkConfigurationVpc build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceResponseBodyDataNetworkConfigurationVpc self = new UpdateWorkspaceResponseBodyDataNetworkConfigurationVpc();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceResponseBodyDataNetworkConfigurationVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateWorkspaceResponseBodyDataNetworkConfigurationVpc setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateWorkspaceResponseBodyDataNetworkConfigurationVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateWorkspaceResponseBodyDataNetworkConfiguration extends TeaModel {
        /**
         * <p>The user VPC network configuration.</p>
         */
        @NameInMap("vpc")
        public UpdateWorkspaceResponseBodyDataNetworkConfigurationVpc vpc;

        public static UpdateWorkspaceResponseBodyDataNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceResponseBodyDataNetworkConfiguration self = new UpdateWorkspaceResponseBodyDataNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceResponseBodyDataNetworkConfiguration setVpc(UpdateWorkspaceResponseBodyDataNetworkConfigurationVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public UpdateWorkspaceResponseBodyDataNetworkConfigurationVpc getVpc() {
            return this.vpc;
        }

    }

    public static class UpdateWorkspaceResponseBodyData extends TeaModel {
        /**
         * <p>The workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>production-agents-v2</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The workspace network configuration.</p>
         */
        @NameInMap("networkConfiguration")
        public UpdateWorkspaceResponseBodyDataNetworkConfiguration networkConfiguration;

        /**
         * <p>The region ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The workspace status. Valid values: Initializing, Initialized, Deleting, Deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>Initialized</p>
         */
        @NameInMap("status")
        public String status;

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

        public static UpdateWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceResponseBodyData self = new UpdateWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWorkspaceResponseBodyData setNetworkConfiguration(UpdateWorkspaceResponseBodyDataNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public UpdateWorkspaceResponseBodyDataNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public UpdateWorkspaceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateWorkspaceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateWorkspaceResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public UpdateWorkspaceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
