// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListElasticNetworkInterfacesResponseBody extends TeaModel {
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
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public ListElasticNetworkInterfacesResponseBodyContent content;

    /**
     * <p>The return message.</p>
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
     * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListElasticNetworkInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListElasticNetworkInterfacesResponseBody self = new ListElasticNetworkInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListElasticNetworkInterfacesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListElasticNetworkInterfacesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListElasticNetworkInterfacesResponseBody setContent(ListElasticNetworkInterfacesResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListElasticNetworkInterfacesResponseBodyContent getContent() {
        return this.content;
    }

    public ListElasticNetworkInterfacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListElasticNetworkInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListElasticNetworkInterfacesResponseBodyContentDataTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListElasticNetworkInterfacesResponseBodyContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListElasticNetworkInterfacesResponseBodyContentDataTags self = new ListElasticNetworkInterfacesResponseBodyContentDataTags();
            return TeaModel.build(map, self);
        }

        public ListElasticNetworkInterfacesResponseBodyContentDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListElasticNetworkInterfacesResponseBodyContentDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListElasticNetworkInterfacesResponseBodyContentData extends TeaModel {
        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1601176751000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>No description</p>
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
         * <p>1640187007000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The IP address of the BE cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.13</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>mac address</p>
         * 
         * <strong>example:</strong>
         * <p>E0:01:A6:4A:6A:D0</p>
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
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-uax37m1****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

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
         * <p>sg-f8z4wr1b41x3qsc9****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListElasticNetworkInterfacesResponseBodyContentDataTags> tags;

        /**
         * <p>network interface controller type, the default type DEFAULT cannot be manually released</p>
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
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-f8ziirfl9k25h2qn7****</p>
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

        public static ListElasticNetworkInterfacesResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListElasticNetworkInterfacesResponseBodyContentData self = new ListElasticNetworkInterfacesResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }
        public String getElasticNetworkInterfaceId() {
            return this.elasticNetworkInterfaceId;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setTags(java.util.List<ListElasticNetworkInterfacesResponseBodyContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListElasticNetworkInterfacesResponseBodyContentDataTags> getTags() {
            return this.tags;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListElasticNetworkInterfacesResponseBodyContentData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListElasticNetworkInterfacesResponseBodyContent extends TeaModel {
        /**
         * <p>lingjun Elastic Network Interface information list</p>
         */
        @NameInMap("Data")
        public java.util.List<ListElasticNetworkInterfacesResponseBodyContentData> data;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListElasticNetworkInterfacesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListElasticNetworkInterfacesResponseBodyContent self = new ListElasticNetworkInterfacesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListElasticNetworkInterfacesResponseBodyContent setData(java.util.List<ListElasticNetworkInterfacesResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListElasticNetworkInterfacesResponseBodyContentData> getData() {
            return this.data;
        }

        public ListElasticNetworkInterfacesResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
