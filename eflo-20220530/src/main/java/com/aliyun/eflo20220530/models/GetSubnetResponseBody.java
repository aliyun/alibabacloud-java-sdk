// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetSubnetResponseBody extends TeaModel {
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
    public GetSubnetResponseBodyContent content;

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
     * <p>0901F411-28FA-5B9C-BAEE-7776463FF0DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSubnetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubnetResponseBody self = new GetSubnetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubnetResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetSubnetResponseBody setContent(GetSubnetResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetSubnetResponseBodyContent getContent() {
        return this.content;
    }

    public GetSubnetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubnetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSubnetResponseBodyContentTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-subnet</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag that is added to the resource.</p>
         * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-group-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetSubnetResponseBodyContentTags build(java.util.Map<String, ?> map) throws Exception {
            GetSubnetResponseBodyContentTags self = new GetSubnetResponseBodyContentTags();
            return TeaModel.build(map, self);
        }

        public GetSubnetResponseBodyContentTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetSubnetResponseBodyContentTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetSubnetResponseBodyContentVpdBaseInfo extends TeaModel {
        /**
         * <p>The CIDR block of the VPD.</p>
         * <ul>
         * <li>We recommend that you use an RFC private endpoint as the Lingjun CIDR block, such as 10.0.0.0/8,172.16.0.0/12,192.168.0.0/16. In scenarios where the Doringjun CIDR block is connected to each other or where the Lingjun CIDR block is connected to a VPC, make sure that the addresses do not conflict with each other.</li>
         * <li>You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 and their subnets as the primary IPv4 CIDR block of the VPD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The time when the activation code was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the Lingjun CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-iv2zm1qf</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>The name of the Lingjun CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-1</p>
         */
        @NameInMap("VpdName")
        public String vpdName;

        public static GetSubnetResponseBodyContentVpdBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSubnetResponseBodyContentVpdBaseInfo self = new GetSubnetResponseBodyContentVpdBaseInfo();
            return TeaModel.build(map, self);
        }

        public GetSubnetResponseBodyContentVpdBaseInfo setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetSubnetResponseBodyContentVpdBaseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSubnetResponseBodyContentVpdBaseInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public GetSubnetResponseBodyContentVpdBaseInfo setVpdName(String vpdName) {
            this.vpdName = vpdName;
            return this;
        }
        public String getVpdName() {
            return this.vpdName;
        }

    }

    public static class GetSubnetResponseBodyContent extends TeaModel {
        /**
         * <p>The number of available IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("AvailableIps")
        public Integer availableIps;

        /**
         * <p>The CIDR block of the Subnet.</p>
         * <ul>
         * <li>The network segment of the subnet must be a proper subset of the network segment of Lingjun to which it belongs, and the mask must be between 16 bits and 29 bits, which can provide 8 to 65536 addresses. For example, the CIDR block of the Lingjun CIDR block is 192.168.0.0/16, and the CIDR blocks of the subnets under the Lingjun CIDR block are 192.168.0.0/17 to 192.168.0.0/29.</li>
         * <li>The first and last three IP addresses of each subnet segment are reserved by the system. For example, the CIDR blocks of the subnet are 192.168.1.0/24,192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The time when the activation code was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1648085472000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the O\&amp;M task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The number of SLB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LbCount")
        public Long lbCount;

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>test example</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The number of NCs.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("NcCount")
        public Integer ncCount;

        /**
         * <p>Number of Lingjun network interface controller</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("NetworkInterfaceCount")
        public Integer networkInterfaceCount;

        /**
         * <p>The total number of secondary private IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PrivateIpCount")
        public Long privateIpCount;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of your Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2l4sq6l7unhi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the cache reserve instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the Lingjun subnet instance.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-aj93mko8</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        /**
         * <p>The name of the Lingjun subnet instance.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-1</p>
         */
        @NameInMap("SubnetName")
        public String subnetName;

        /**
         * <p>The tag information.</p>
         * <p>You can specify up to 20 tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetSubnetResponseBodyContentTags> tags;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1655449505171</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Lingjun Subnet Usage Type; optional; optional. Valid values:</p>
         * <ul>
         * <li><strong>Empty for common data types</strong></li>
         * <li><strong>OOB</strong> :OOB type</li>
         * <li><strong>LB</strong>: LB type</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OOB</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The information about the network segment of Lingjun.</p>
         */
        @NameInMap("VpdBaseInfo")
        public GetSubnetResponseBodyContentVpdBaseInfo vpdBaseInfo;

        /**
         * <p>The ID of the Lingjun CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-ze3na0wf</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetSubnetResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetSubnetResponseBodyContent self = new GetSubnetResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetSubnetResponseBodyContent setAvailableIps(Integer availableIps) {
            this.availableIps = availableIps;
            return this;
        }
        public Integer getAvailableIps() {
            return this.availableIps;
        }

        public GetSubnetResponseBodyContent setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetSubnetResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSubnetResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetSubnetResponseBodyContent setLbCount(Long lbCount) {
            this.lbCount = lbCount;
            return this;
        }
        public Long getLbCount() {
            return this.lbCount;
        }

        public GetSubnetResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetSubnetResponseBodyContent setNcCount(Integer ncCount) {
            this.ncCount = ncCount;
            return this;
        }
        public Integer getNcCount() {
            return this.ncCount;
        }

        public GetSubnetResponseBodyContent setNetworkInterfaceCount(Integer networkInterfaceCount) {
            this.networkInterfaceCount = networkInterfaceCount;
            return this;
        }
        public Integer getNetworkInterfaceCount() {
            return this.networkInterfaceCount;
        }

        public GetSubnetResponseBodyContent setPrivateIpCount(Long privateIpCount) {
            this.privateIpCount = privateIpCount;
            return this;
        }
        public Long getPrivateIpCount() {
            return this.privateIpCount;
        }

        public GetSubnetResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetSubnetResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetSubnetResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSubnetResponseBodyContent setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public GetSubnetResponseBodyContent setSubnetName(String subnetName) {
            this.subnetName = subnetName;
            return this;
        }
        public String getSubnetName() {
            return this.subnetName;
        }

        public GetSubnetResponseBodyContent setTags(java.util.List<GetSubnetResponseBodyContentTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetSubnetResponseBodyContentTags> getTags() {
            return this.tags;
        }

        public GetSubnetResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetSubnetResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSubnetResponseBodyContent setVpdBaseInfo(GetSubnetResponseBodyContentVpdBaseInfo vpdBaseInfo) {
            this.vpdBaseInfo = vpdBaseInfo;
            return this;
        }
        public GetSubnetResponseBodyContentVpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        public GetSubnetResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public GetSubnetResponseBodyContent setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
