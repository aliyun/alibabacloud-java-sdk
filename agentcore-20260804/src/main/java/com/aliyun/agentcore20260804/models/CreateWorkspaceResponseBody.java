// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResponseBody extends TeaModel {
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
    public CreateWorkspaceResponseBodyData data;

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
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResponseBody self = new CreateWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWorkspaceResponseBody setData(CreateWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public CreateWorkspaceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateWorkspaceResponseBodyDataNetworkConfigurationVpc extends TeaModel {
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
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1234567890</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static CreateWorkspaceResponseBodyDataNetworkConfigurationVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResponseBodyDataNetworkConfigurationVpc self = new CreateWorkspaceResponseBodyDataNetworkConfigurationVpc();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResponseBodyDataNetworkConfigurationVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateWorkspaceResponseBodyDataNetworkConfigurationVpc setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateWorkspaceResponseBodyDataNetworkConfigurationVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateWorkspaceResponseBodyDataNetworkConfiguration extends TeaModel {
        /**
         * <p>The VPC network configuration of the user.</p>
         */
        @NameInMap("vpc")
        public CreateWorkspaceResponseBodyDataNetworkConfigurationVpc vpc;

        public static CreateWorkspaceResponseBodyDataNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResponseBodyDataNetworkConfiguration self = new CreateWorkspaceResponseBodyDataNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResponseBodyDataNetworkConfiguration setVpc(CreateWorkspaceResponseBodyDataNetworkConfigurationVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public CreateWorkspaceResponseBodyDataNetworkConfigurationVpc getVpc() {
            return this.vpc;
        }

    }

    public static class CreateWorkspaceResponseBodyData extends TeaModel {
        /**
         * <p>The workspace name.</p>
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
        public CreateWorkspaceResponseBodyDataNetworkConfiguration networkConfiguration;

        /**
         * <p>The region ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The workspace status.</p>
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

        public static CreateWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResponseBodyData self = new CreateWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkspaceResponseBodyData setNetworkConfiguration(CreateWorkspaceResponseBodyDataNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public CreateWorkspaceResponseBodyDataNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public CreateWorkspaceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateWorkspaceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateWorkspaceResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateWorkspaceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
