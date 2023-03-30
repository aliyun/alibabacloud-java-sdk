// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListNetworkInterfacesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public ListNetworkInterfacesResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListNetworkInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkInterfacesResponseBody self = new ListNetworkInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkInterfacesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListNetworkInterfacesResponseBody setContent(ListNetworkInterfacesResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListNetworkInterfacesResponseBodyContent getContent() {
        return this.content;
    }

    public ListNetworkInterfacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNetworkInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup extends TeaModel {
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

        public static ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup self = new ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup();
            return TeaModel.build(map, self);
        }

        public ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup setIpAddressMac(String ipAddressMac) {
            this.ipAddressMac = ipAddressMac;
            return this;
        }
        public String getIpAddressMac() {
            return this.ipAddressMac;
        }

        public ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup setIpName(String ipName) {
            this.ipName = ipName;
            return this;
        }
        public String getIpName() {
            return this.ipName;
        }

        public ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("SubnetId")
        public String subnetId;

        public static ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo self = new ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo();
            return TeaModel.build(map, self);
        }

        public ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

    }

    public static class ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("VpdId")
        public String vpdId;

        @NameInMap("VpdName")
        public String vpdName;

        public static ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo self = new ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo();
            return TeaModel.build(map, self);
        }

        public ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo setVpdName(String vpdName) {
            this.vpdName = vpdName;
            return this;
        }
        public String getVpdName() {
            return this.vpdName;
        }

    }

    public static class ListNetworkInterfacesResponseBodyContentData extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Ethernet")
        public java.util.List<String> ethernet;

        @NameInMap("Gateway")
        public String gateway;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("NcType")
        public String ncType;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("PrivateIpAddressMacGroup")
        public java.util.List<ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup> privateIpAddressMacGroup;

        @NameInMap("Quota")
        public Integer quota;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServiceMac")
        public String serviceMac;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubnetBaseInfo")
        public ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo subnetBaseInfo;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("VpdBaseInfo")
        public ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo vpdBaseInfo;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListNetworkInterfacesResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkInterfacesResponseBodyContentData self = new ListNetworkInterfacesResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListNetworkInterfacesResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListNetworkInterfacesResponseBodyContentData setEthernet(java.util.List<String> ethernet) {
            this.ethernet = ethernet;
            return this;
        }
        public java.util.List<String> getEthernet() {
            return this.ethernet;
        }

        public ListNetworkInterfacesResponseBodyContentData setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public ListNetworkInterfacesResponseBodyContentData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListNetworkInterfacesResponseBodyContentData setNcType(String ncType) {
            this.ncType = ncType;
            return this;
        }
        public String getNcType() {
            return this.ncType;
        }

        public ListNetworkInterfacesResponseBodyContentData setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public ListNetworkInterfacesResponseBodyContentData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListNetworkInterfacesResponseBodyContentData setPrivateIpAddressMacGroup(java.util.List<ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup> privateIpAddressMacGroup) {
            this.privateIpAddressMacGroup = privateIpAddressMacGroup;
            return this;
        }
        public java.util.List<ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup> getPrivateIpAddressMacGroup() {
            return this.privateIpAddressMacGroup;
        }

        public ListNetworkInterfacesResponseBodyContentData setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public ListNetworkInterfacesResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListNetworkInterfacesResponseBodyContentData setServiceMac(String serviceMac) {
            this.serviceMac = serviceMac;
            return this;
        }
        public String getServiceMac() {
            return this.serviceMac;
        }

        public ListNetworkInterfacesResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListNetworkInterfacesResponseBodyContentData setSubnetBaseInfo(ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo subnetBaseInfo) {
            this.subnetBaseInfo = subnetBaseInfo;
            return this;
        }
        public ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo getSubnetBaseInfo() {
            return this.subnetBaseInfo;
        }

        public ListNetworkInterfacesResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListNetworkInterfacesResponseBodyContentData setVpdBaseInfo(ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo vpdBaseInfo) {
            this.vpdBaseInfo = vpdBaseInfo;
            return this;
        }
        public ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        public ListNetworkInterfacesResponseBodyContentData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListNetworkInterfacesResponseBodyContent extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListNetworkInterfacesResponseBodyContentData> data;

        @NameInMap("Total")
        public Long total;

        public static ListNetworkInterfacesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkInterfacesResponseBodyContent self = new ListNetworkInterfacesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListNetworkInterfacesResponseBodyContent setData(java.util.List<ListNetworkInterfacesResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListNetworkInterfacesResponseBodyContentData> getData() {
            return this.data;
        }

        public ListNetworkInterfacesResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
