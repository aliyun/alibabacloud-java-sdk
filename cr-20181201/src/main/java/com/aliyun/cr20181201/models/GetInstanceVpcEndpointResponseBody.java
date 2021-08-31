// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceVpcEndpointResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Domains")
    public java.util.List<String> domains;

    @NameInMap("LinkedVpcs")
    public java.util.List<GetInstanceVpcEndpointResponseBodyLinkedVpcs> linkedVpcs;

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

    public GetInstanceVpcEndpointResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetInstanceVpcEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceVpcEndpointResponseBody setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public GetInstanceVpcEndpointResponseBody setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public GetInstanceVpcEndpointResponseBody setLinkedVpcs(java.util.List<GetInstanceVpcEndpointResponseBodyLinkedVpcs> linkedVpcs) {
        this.linkedVpcs = linkedVpcs;
        return this;
    }
    public java.util.List<GetInstanceVpcEndpointResponseBodyLinkedVpcs> getLinkedVpcs() {
        return this.linkedVpcs;
    }

    public static class GetInstanceVpcEndpointResponseBodyLinkedVpcs extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("DefaultAccess")
        public Boolean defaultAccess;

        @NameInMap("VswitchId")
        public String vswitchId;

        public static GetInstanceVpcEndpointResponseBodyLinkedVpcs build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceVpcEndpointResponseBodyLinkedVpcs self = new GetInstanceVpcEndpointResponseBodyLinkedVpcs();
            return TeaModel.build(map, self);
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

        public GetInstanceVpcEndpointResponseBodyLinkedVpcs setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetInstanceVpcEndpointResponseBodyLinkedVpcs setDefaultAccess(Boolean defaultAccess) {
            this.defaultAccess = defaultAccess;
            return this;
        }
        public Boolean getDefaultAccess() {
            return this.defaultAccess;
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
