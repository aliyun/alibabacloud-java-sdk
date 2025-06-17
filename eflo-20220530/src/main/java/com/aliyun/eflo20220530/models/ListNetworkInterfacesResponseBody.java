// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListNetworkInterfacesResponseBody extends TeaModel {
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
     * <p>The response data.</p>
     */
    @NameInMap("Content")
    public ListNetworkInterfacesResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>039C3C3A-3C37-5672-80D5-D8CD48C676D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNetworkInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkInterfacesResponseBody self = new ListNetworkInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNetworkInterfacesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Secondary private MAC address.</p>
         * 
         * <strong>example:</strong>
         * <p>00:25:9d:00:20:20</p>
         */
        @NameInMap("IpAddressMac")
        public String ipAddressMac;

        /**
         * <p>The unique IP identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>sip-1asjd3xg</p>
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
         * <p>The secondary private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.14</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The status of the cache reserve instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup self = new ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup();
            return TeaModel.build(map, self);
        }

        public ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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
        /**
         * <p>The network segment of the Subnet.</p>
         * <ul>
         * <li>The network segment of the subnet must be a proper subset of the network segment of Lingjun to which it belongs, and the mask must be between 16 bits and 29 bits, which can provide 8 to 65536 addresses. For example, the CIDR block of the Lingjun CIDR block is 192.168.0.0/16, and the CIDR blocks of the subnets under the Lingjun CIDR block are 192.168.0.0/17 to 192.168.0.0/29.</li>
         * <li>The first and last three IP addresses of each subnet segment are reserved by the system. For example, the CIDR blocks of the subnet are 192.168.1.0/24,192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
         * </ul>
         * <p>For more information about CIDR blocks, see the <a href="https://www.alibabacloud.com/help/doc-detail/40637.htm#title-gu4-uzk-12r">What is CIDR?</a> section in the &quot;Network FAQ&quot; topic.</p>
         * <p>This parameter is left empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The time when the activation code was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1623656472000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the Subnet instance.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-yjnqn5ef</p>
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

        public ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo setSubnetName(String subnetName) {
            this.subnetName = subnetName;
            return this;
        }
        public String getSubnetName() {
            return this.subnetName;
        }

    }

    public static class ListNetworkInterfacesResponseBodyContentDataTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListNetworkInterfacesResponseBodyContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkInterfacesResponseBodyContentDataTags self = new ListNetworkInterfacesResponseBodyContentDataTags();
            return TeaModel.build(map, self);
        }

        public ListNetworkInterfacesResponseBodyContentDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListNetworkInterfacesResponseBodyContentDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo extends TeaModel {
        /**
         * <p>The network segment of Lingjun network segment (VPD).</p>
         * <ul>
         * <li>We recommend that you use an RFC private endpoint as the Lingjun CIDR block, such as 10.0.0.0/8,172.16.0.0/12,192.168.0.0/16. In scenarios where the Doringjun CIDR block is connected to each other or where the Lingjun CIDR block is connected to a VPC, make sure that the addresses do not conflict with each other.</li>
         * <li>You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 and their subnets as the primary IPv4 CIDR block of the VPD. This parameter is left empty by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/16</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The time when the activation code was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1668158213000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the VPD instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-d3isyds4</p>
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
        /**
         * <p>The time when the activation code was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1669734207000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The port number of the AD server.</p>
         */
        @NameInMap("Ethernet")
        public java.util.List<String> ethernet;

        /**
         * <p>The gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.253</p>
         */
        @NameInMap("Gateway")
        public String gateway;

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.13</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The NC type.</p>
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
         * <p>GPU</p>
         */
        @NameInMap("NcType")
        public String ncType;

        /**
         * <p>Lingjun network interface controller ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lni-2ze50voovmtswn328ogm</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The port name.</p>
         * 
         * <strong>example:</strong>
         * <p>bond0</p>
         */
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        /**
         * <p>The ID of the machine to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>2d53f5c204e7476dae69177e7fa6f19c</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Secondary Private IP\&amp;MAC Address Collection</p>
         */
        @NameInMap("PrivateIpAddressMacGroup")
        public java.util.List<ListNetworkInterfacesResponseBodyContentDataPrivateIpAddressMacGroup> privateIpAddressMacGroup;

        /**
         * <p>network interface controller private secondary IP quota.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
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

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-1234567890</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The address of the service network interface controller.</p>
         * 
         * <strong>example:</strong>
         * <p>00-ff-84-15-ba-67</p>
         */
        @NameInMap("ServiceMac")
        public String serviceMac;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Lingjun subnet (Subnet) basic information.</p>
         */
        @NameInMap("SubnetBaseInfo")
        public ListNetworkInterfacesResponseBodyContentDataSubnetBaseInfo subnetBaseInfo;

        /**
         * <p>List of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListNetworkInterfacesResponseBodyContentDataTags> tags;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166279</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Lingjun network segment (VPD) basic information.</p>
         */
        @NameInMap("VpdBaseInfo")
        public ListNetworkInterfacesResponseBodyContentDataVpdBaseInfo vpdBaseInfo;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
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

        public ListNetworkInterfacesResponseBodyContentData setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
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

        public ListNetworkInterfacesResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        public ListNetworkInterfacesResponseBodyContentData setTags(java.util.List<ListNetworkInterfacesResponseBodyContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListNetworkInterfacesResponseBodyContentDataTags> getTags() {
            return this.tags;
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
        /**
         * <p>The response parameters.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListNetworkInterfacesResponseBodyContentData> data;

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
