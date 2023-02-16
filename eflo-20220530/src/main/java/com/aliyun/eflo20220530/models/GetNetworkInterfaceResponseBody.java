// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetNetworkInterfaceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetNetworkInterfaceResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkInterfaceResponseBody self = new GetNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetworkInterfaceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetNetworkInterfaceResponseBody setContent(GetNetworkInterfaceResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetNetworkInterfaceResponseBodyContent getContent() {
        return this.content;
    }

    public GetNetworkInterfaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup extends TeaModel {
        @NameInMap("IpAddressMac")
        public String ipAddressMac;

        @NameInMap("IpName")
        public String ipName;

        @NameInMap("Message")
        public String message;

        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        @NameInMap("Status")
        public String status;

        public static GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup self = new GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup();
            return TeaModel.build(map, self);
        }

        public GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup setIpAddressMac(String ipAddressMac) {
            this.ipAddressMac = ipAddressMac;
            return this;
        }
        public String getIpAddressMac() {
            return this.ipAddressMac;
        }

        public GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup setIpName(String ipName) {
            this.ipName = ipName;
            return this;
        }
        public String getIpName() {
            return this.ipName;
        }

        public GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetNetworkInterfaceResponseBodyContentSubnetBaseInfo extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("SubnetId")
        public String subnetId;

        public static GetNetworkInterfaceResponseBodyContentSubnetBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkInterfaceResponseBodyContentSubnetBaseInfo self = new GetNetworkInterfaceResponseBodyContentSubnetBaseInfo();
            return TeaModel.build(map, self);
        }

        public GetNetworkInterfaceResponseBodyContentSubnetBaseInfo setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetNetworkInterfaceResponseBodyContentSubnetBaseInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetNetworkInterfaceResponseBodyContentSubnetBaseInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNetworkInterfaceResponseBodyContentSubnetBaseInfo setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

    }

    public static class GetNetworkInterfaceResponseBodyContentVpdBaseInfo extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("VpdId")
        public String vpdId;

        public static GetNetworkInterfaceResponseBodyContentVpdBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkInterfaceResponseBodyContentVpdBaseInfo self = new GetNetworkInterfaceResponseBodyContentVpdBaseInfo();
            return TeaModel.build(map, self);
        }

        public GetNetworkInterfaceResponseBodyContentVpdBaseInfo setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetNetworkInterfaceResponseBodyContentVpdBaseInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetNetworkInterfaceResponseBodyContentVpdBaseInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNetworkInterfaceResponseBodyContentVpdBaseInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

    public static class GetNetworkInterfaceResponseBodyContent extends TeaModel {
        @NameInMap("Ethernet")
        public java.util.List<String> ethernet;

        @NameInMap("Gateway")
        public String gateway;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("PrivateIpAddressMacGroup")
        public java.util.List<GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup> privateIpAddressMacGroup;

        @NameInMap("Quota")
        public Integer quota;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServiceMac")
        public String serviceMac;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubnetBaseInfo")
        public GetNetworkInterfaceResponseBodyContentSubnetBaseInfo subnetBaseInfo;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("VpdBaseInfo")
        public GetNetworkInterfaceResponseBodyContentVpdBaseInfo vpdBaseInfo;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetNetworkInterfaceResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkInterfaceResponseBodyContent self = new GetNetworkInterfaceResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetNetworkInterfaceResponseBodyContent setEthernet(java.util.List<String> ethernet) {
            this.ethernet = ethernet;
            return this;
        }
        public java.util.List<String> getEthernet() {
            return this.ethernet;
        }

        public GetNetworkInterfaceResponseBodyContent setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public GetNetworkInterfaceResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetNetworkInterfaceResponseBodyContent setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetNetworkInterfaceResponseBodyContent setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public GetNetworkInterfaceResponseBodyContent setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetNetworkInterfaceResponseBodyContent setPrivateIpAddressMacGroup(java.util.List<GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup> privateIpAddressMacGroup) {
            this.privateIpAddressMacGroup = privateIpAddressMacGroup;
            return this;
        }
        public java.util.List<GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup> getPrivateIpAddressMacGroup() {
            return this.privateIpAddressMacGroup;
        }

        public GetNetworkInterfaceResponseBodyContent setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public GetNetworkInterfaceResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetNetworkInterfaceResponseBodyContent setServiceMac(String serviceMac) {
            this.serviceMac = serviceMac;
            return this;
        }
        public String getServiceMac() {
            return this.serviceMac;
        }

        public GetNetworkInterfaceResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetNetworkInterfaceResponseBodyContent setSubnetBaseInfo(GetNetworkInterfaceResponseBodyContentSubnetBaseInfo subnetBaseInfo) {
            this.subnetBaseInfo = subnetBaseInfo;
            return this;
        }
        public GetNetworkInterfaceResponseBodyContentSubnetBaseInfo getSubnetBaseInfo() {
            return this.subnetBaseInfo;
        }

        public GetNetworkInterfaceResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetNetworkInterfaceResponseBodyContent setVpdBaseInfo(GetNetworkInterfaceResponseBodyContentVpdBaseInfo vpdBaseInfo) {
            this.vpdBaseInfo = vpdBaseInfo;
            return this;
        }
        public GetNetworkInterfaceResponseBodyContentVpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        public GetNetworkInterfaceResponseBodyContent setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
