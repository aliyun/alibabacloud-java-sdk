// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceVpcEndpointResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Domains")
    public java.util.List<String> domains;

    /**
     * <p>Indicates whether the access control list (ACL) feature is enabled. Valid values:</p>
     * <br>
     * <p>*   `true`: The ACL feature is enabled.</p>
     * <p>*   `false`: The ACL feature is disabled.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request is successful.</p>
     * <p>*   `false`: The request fails.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The VPCs in which the instance is deployed.</p>
     */
    @NameInMap("LinkedVpcs")
    public java.util.List<GetInstanceVpcEndpointResponseBodyLinkedVpcs> linkedVpcs;

    @NameInMap("ModuleName")
    public String moduleName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceVpcEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceVpcEndpointResponseBody self = new GetInstanceVpcEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceVpcEndpointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceVpcEndpointResponseBody setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public GetInstanceVpcEndpointResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public GetInstanceVpcEndpointResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetInstanceVpcEndpointResponseBody setLinkedVpcs(java.util.List<GetInstanceVpcEndpointResponseBodyLinkedVpcs> linkedVpcs) {
        this.linkedVpcs = linkedVpcs;
        return this;
    }
    public java.util.List<GetInstanceVpcEndpointResponseBodyLinkedVpcs> getLinkedVpcs() {
        return this.linkedVpcs;
    }

    public GetInstanceVpcEndpointResponseBody setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public GetInstanceVpcEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceVpcEndpointResponseBodyLinkedVpcs extends TeaModel {
        /**
         * <p>Indicates whether the default ACL is used.</p>
         */
        @NameInMap("DefaultAccess")
        public Boolean defaultAccess;

        /**
         * <p>IP address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The status of the VPC. Valid values:</p>
         * <br>
         * <p>*   `CREATING`: The VPC is being created.</p>
         * <p>*   `RUNNING`: The VPC is running.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>VPC ID</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        public static GetInstanceVpcEndpointResponseBodyLinkedVpcs build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceVpcEndpointResponseBodyLinkedVpcs self = new GetInstanceVpcEndpointResponseBodyLinkedVpcs();
            return TeaModel.build(map, self);
        }

        public GetInstanceVpcEndpointResponseBodyLinkedVpcs setDefaultAccess(Boolean defaultAccess) {
            this.defaultAccess = defaultAccess;
            return this;
        }
        public Boolean getDefaultAccess() {
            return this.defaultAccess;
        }

        public GetInstanceVpcEndpointResponseBodyLinkedVpcs setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetInstanceVpcEndpointResponseBodyLinkedVpcs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceVpcEndpointResponseBodyLinkedVpcs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetInstanceVpcEndpointResponseBodyLinkedVpcs setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

}
