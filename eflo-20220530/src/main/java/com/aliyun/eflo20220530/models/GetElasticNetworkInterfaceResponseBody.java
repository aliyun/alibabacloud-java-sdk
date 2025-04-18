// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetElasticNetworkInterfaceResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
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
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public GetElasticNetworkInterfaceResponseBodyContent content;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0901F411-28FA-5B9C-BAEE-7776463FF0DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetElasticNetworkInterfaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetElasticNetworkInterfaceResponseBody self = new GetElasticNetworkInterfaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetElasticNetworkInterfaceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetElasticNetworkInterfaceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetElasticNetworkInterfaceResponseBody setContent(GetElasticNetworkInterfaceResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetElasticNetworkInterfaceResponseBodyContent getContent() {
        return this.content;
    }

    public GetElasticNetworkInterfaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetElasticNetworkInterfaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses extends TeaModel {
        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Lingjun Elastic Network Interface ID</p>
         * 
         * <strong>example:</strong>
         * <p>leni-1234****</p>
         */
        @NameInMap("ElasticNetworkInterfaceId")
        public String elasticNetworkInterfaceId;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1585816811000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the cluster was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1549012834000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>IPV6 unique identifier</p>
         * 
         * <strong>example:</strong>
         * <p>sip-sg3xabeq</p>
         */
        @NameInMap("IpName")
        public String ipName;

        /**
         * <p>IPV6 address</p>
         * 
         * <strong>example:</strong>
         * <p>2408:4005:3aa:1000:470d:66fb:56a5:****</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses build(java.util.Map<String, ?> map) throws Exception {
            GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses self = new GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses();
            return TeaModel.build(map, self);
        }

        public GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        public GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses setIpName(String ipName) {
            this.ipName = ipName;
            return this;
        }
        public String getIpName() {
            return this.ipName;
        }

        public GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses extends TeaModel {
        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Lingjun Elastic Network Interface ID</p>
         * 
         * <strong>example:</strong>
         * <p>leni-1234****</p>
         */
        @NameInMap("ElasticNetworkInterfaceId")
        public String elasticNetworkInterfaceId;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1672971789000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the cluster was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1672971789000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Lingjun Elastic Network Interface Secondary Private IP Unique Identifier</p>
         * 
         * <strong>example:</strong>
         * <p>sip-ywz****</p>
         */
        @NameInMap("IpName")
        public String ipName;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Lingjun Elastic Network Interface secondary private IP address</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.****</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses self = new GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses();
            return TeaModel.build(map, self);
        }

        public GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        public GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses setIpName(String ipName) {
            this.ipName = ipName;
            return this;
        }
        public String getIpName() {
            return this.ipName;
        }

        public GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetElasticNetworkInterfaceResponseBodyContent extends TeaModel {
        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-13 12:51:41</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>terraform-example</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Lingjun Elastic Network Interface ID</p>
         * 
         * <strong>example:</strong>
         * <p>leni-1234****</p>
         */
        @NameInMap("ElasticNetworkInterfaceId")
        public String elasticNetworkInterfaceId;

        /**
         * <p>Whether to enable the jumboFrame capability</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("EnableJumboFrame")
        public Boolean enableJumboFrame;

        /**
         * <p>vswitch gateway address</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.****</p>
         */
        @NameInMap("Gateway")
        public String gateway;

        /**
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-13 12:51:41</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Elastic Network Interface IP</p>
         * 
         * <strong>example:</strong>
         * <p>203.107.****</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>IPV6 address</p>
         */
        @NameInMap("Ipv6Addresses")
        public java.util.List<GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses> ipv6Addresses;

        /**
         * <p>mac address</p>
         * 
         * <strong>example:</strong>
         * <p>00:22:6D:97:<strong>:</strong></p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>vswitch mask bits</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Lingjun Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-lbj3aej****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Secondary private IP address</p>
         */
        @NameInMap("PrivateIpAddresses")
        public java.util.List<GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses> privateIpAddresses;

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
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-0jl5s4p4laalruk7****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The state of the private gateway.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Create Failed: the creation failure.</li>
         * <li>Delete Failed: the that failed to be deleted.</li>
         * <li>Executing</li>
         * <li>Available</li>
         * <li>Deleting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>NIC Type</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>CUSTOM: custom type.</li>
         * <li>DEFAULT: system type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6u8473r84e9****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-j6ctp4n75306****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetElasticNetworkInterfaceResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetElasticNetworkInterfaceResponseBodyContent self = new GetElasticNetworkInterfaceResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetElasticNetworkInterfaceResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setEnableJumboFrame(Boolean enableJumboFrame) {
            this.enableJumboFrame = enableJumboFrame;
            return this;
        }
        public Boolean getEnableJumboFrame() {
            return this.enableJumboFrame;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setIpv6Addresses(java.util.List<GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }
        public java.util.List<GetElasticNetworkInterfaceResponseBodyContentIpv6Addresses> getIpv6Addresses() {
            return this.ipv6Addresses;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setPrivateIpAddresses(java.util.List<GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses> privateIpAddresses) {
            this.privateIpAddresses = privateIpAddresses;
            return this;
        }
        public java.util.List<GetElasticNetworkInterfaceResponseBodyContentPrivateIpAddresses> getPrivateIpAddresses() {
            return this.privateIpAddresses;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetElasticNetworkInterfaceResponseBodyContent setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
