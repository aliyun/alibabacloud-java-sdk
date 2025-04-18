// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetNetworkInterfaceResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response data. (If a resource has dependent resources, the existing dependent resources are returned.)</p>
     */
    @NameInMap("Content")
    public GetNetworkInterfaceResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkInterfaceResponseBody self = new GetNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNetworkInterfaceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Secondary private MAC address</p>
         * 
         * <strong>example:</strong>
         * <p>01-00-5e-00-00-16</p>
         */
        @NameInMap("IpAddressMac")
        public String ipAddressMac;

        /**
         * <p>IP unique identifier</p>
         * 
         * <strong>example:</strong>
         * <p>sip-xxxx</p>
         */
        @NameInMap("IpName")
        public String ipName;

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Secondary private IP address</p>
         * 
         * <strong>example:</strong>
         * <p>172.23.161.57</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The state of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup self = new GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup();
            return TeaModel.build(map, self);
        }

        public GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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
        /**
         * <p>Network address segment</p>
         * 
         * <strong>example:</strong>
         * <p>116.233.21.57/32</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the Subnet instance.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-urb01blo</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        /**
         * <p>The name of the Subnet instance.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-1</p>
         */
        @NameInMap("SubnetName")
        public String subnetName;

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

        public GetNetworkInterfaceResponseBodyContentSubnetBaseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetNetworkInterfaceResponseBodyContentSubnetBaseInfo setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public GetNetworkInterfaceResponseBodyContentSubnetBaseInfo setSubnetName(String subnetName) {
            this.subnetName = subnetName;
            return this;
        }
        public String getSubnetName() {
            return this.subnetName;
        }

    }

    public static class GetNetworkInterfaceResponseBodyContentVpdBaseInfo extends TeaModel {
        /**
         * <p>The network segment of the Lingjun subnet.</p>
         * <ul>
         * <li>The network segment of the subnet must be a proper subset of the network segment of Lingjun to which it belongs, and the mask must be between 16 bits and 29 bits, which can provide 8 to 65536 addresses. For example, the CIDR block of the Lingjun CIDR block is 192.168.0.0/16, and the CIDR blocks of the subnets under the Lingjun CIDR block are 192.168.0.0/17 to 192.168.0.0/29.</li>
         * <li>The first and last three IP addresses of each subnet segment are reserved by the system. For example, the CIDR blocks of the subnet are 192.168.1.0/24,192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
         * </ul>
         * <p>For more information about CIDR blocks, see the <a href="https://www.alibabacloud.com/help/doc-detail/40637.htm#title-gu4-uzk-12r">What is CIDR?</a> section in the &quot;Network FAQ&quot; topic.</p>
         * <p>This parameter is left empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>172.18.0.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the VPD instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-ppdunxzc</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>The name of the VPD instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-1</p>
         */
        @NameInMap("VpdName")
        public String vpdName;

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

        public GetNetworkInterfaceResponseBodyContentVpdBaseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetNetworkInterfaceResponseBodyContentVpdBaseInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public GetNetworkInterfaceResponseBodyContentVpdBaseInfo setVpdName(String vpdName) {
            this.vpdName = vpdName;
            return this;
        }
        public String getVpdName() {
            return this.vpdName;
        }

    }

    public static class GetNetworkInterfaceResponseBodyContent extends TeaModel {
        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Port</p>
         */
        @NameInMap("Ethernet")
        public java.util.List<String> ethernet;

        /**
         * <p>Gateway</p>
         * 
         * <strong>example:</strong>
         * <p>172.24.20.254</p>
         */
        @NameInMap("Gateway")
        public String gateway;

        /**
         * <p>The IP address of the BE cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>203.107.60.69</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>NC Type</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>CUSTOM_LNI_INTEGRATION: two-network one-in-one architecture Lingjun hosting network interface controller.</li>
         * <li>CPU: CPU machine.</li>
         * <li>ELASTIC_6.2: Machine</li>
         * <li>GPU: GPU machine.</li>
         * <li>DEFAULT: the old CPU machine.</li>
         * <li>CUSTOM_LNI: two network separation architecture Lingjun hosting network interface controller.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("NcType")
        public String ncType;

        /**
         * <p>Lingjun network interface controller ID</p>
         * 
         * <strong>example:</strong>
         * <p>lni-f8z4scmfh0u4ewv6vdd8</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>ENI Name</p>
         * 
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        /**
         * <p>The ID of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>masterintranett2fdth5fkoocg</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Secondary Private IP\&amp;MAC Address Collection</p>
         */
        @NameInMap("PrivateIpAddressMacGroup")
        public java.util.List<GetNetworkInterfaceResponseBodyContentPrivateIpAddressMacGroup> privateIpAddressMacGroup;

        /**
         * <p>network interface controller private secondary IP limit</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Quota")
        public Integer quota;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Service network interface controller address</p>
         * 
         * <strong>example:</strong>
         * <p>01-00-5e-00-00-16</p>
         */
        @NameInMap("ServiceMac")
        public String serviceMac;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Lingjun subnet (Subnet) basic information</p>
         */
        @NameInMap("SubnetBaseInfo")
        public GetNetworkInterfaceResponseBodyContentSubnetBaseInfo subnetBaseInfo;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1655449505171</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Basic information of Lingjun network segment (VPD)</p>
         */
        @NameInMap("VpdBaseInfo")
        public GetNetworkInterfaceResponseBodyContentVpdBaseInfo vpdBaseInfo;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetNetworkInterfaceResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetNetworkInterfaceResponseBodyContent self = new GetNetworkInterfaceResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetNetworkInterfaceResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public GetNetworkInterfaceResponseBodyContent setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetNetworkInterfaceResponseBodyContent setNcType(String ncType) {
            this.ncType = ncType;
            return this;
        }
        public String getNcType() {
            return this.ncType;
        }

        public GetNetworkInterfaceResponseBodyContent setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public GetNetworkInterfaceResponseBodyContent setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
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

        public GetNetworkInterfaceResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
