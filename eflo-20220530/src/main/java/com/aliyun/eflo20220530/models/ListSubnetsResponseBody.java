// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListSubnetsResponseBody extends TeaModel {
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
    public ListSubnetsResponseBodyContent content;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>7F9082CC-3D94-560F-A575-8E8EF6CE2CB8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSubnetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubnetsResponseBody self = new ListSubnetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubnetsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSubnetsResponseBody setContent(ListSubnetsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListSubnetsResponseBodyContent getContent() {
        return this.content;
    }

    public ListSubnetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubnetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSubnetsResponseBodyContentDataTags extends TeaModel {
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

        public static ListSubnetsResponseBodyContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListSubnetsResponseBodyContentDataTags self = new ListSubnetsResponseBodyContentDataTags();
            return TeaModel.build(map, self);
        }

        public ListSubnetsResponseBodyContentDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListSubnetsResponseBodyContentDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListSubnetsResponseBodyContentDataVpdBaseInfo extends TeaModel {
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
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Lingjun CIDR block instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-d3isyds4</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>Lingjun CIDR block instance name</p>
         * 
         * <strong>example:</strong>
         * <p>yzp-rg-test3</p>
         */
        @NameInMap("VpdName")
        public String vpdName;

        public static ListSubnetsResponseBodyContentDataVpdBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSubnetsResponseBodyContentDataVpdBaseInfo self = new ListSubnetsResponseBodyContentDataVpdBaseInfo();
            return TeaModel.build(map, self);
        }

        public ListSubnetsResponseBodyContentDataVpdBaseInfo setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListSubnetsResponseBodyContentDataVpdBaseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSubnetsResponseBodyContentDataVpdBaseInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public ListSubnetsResponseBodyContentDataVpdBaseInfo setVpdName(String vpdName) {
            this.vpdName = vpdName;
            return this;
        }
        public String getVpdName() {
            return this.vpdName;
        }

    }

    public static class ListSubnetsResponseBodyContentData extends TeaModel {
        /**
         * <p>The CIDR block of the Subnet.</p>
         * <ul>
         * <li>The network segment of the subnet must be a proper subset of the network segment of Lingjun to which it belongs, and the mask must be between 16 bits and 29 bits, which can provide 8 to 65536 addresses. For example, the CIDR block of the Lingjun CIDR block is 192.168.0.0/16, and the CIDR blocks of the subnets under the Lingjun CIDR block are 192.168.0.0/17 to 192.168.0.0/29.</li>
         * <li>The first and last three IP addresses of each subnet segment are reserved by the system. For example, the CIDR blocks of the subnet are 192.168.1.0/24,192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
         * </ul>
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
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Number of NCs</p>
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
         * <p>1</p>
         */
        @NameInMap("NetworkInterfaceCount")
        public Integer networkInterfaceCount;

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
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm?spm=a2c4g.11186623.0.0.29e15d7akXhpuu">Resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2l4sq6l7unhi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the cache reserve instance. Valid values:</p>
         * <ul>
         * <li><strong>Available</strong>: Normal</li>
         * <li><strong>Not Available</strong>: Unavailable</li>
         * <li><strong>Executing</strong>: Executing</li>
         * <li><strong>Deleting</strong>: The node is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Lingjun subnet instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-c6wci55i</p>
         */
        @NameInMap("SubnetId")
        public String subnetId;

        /**
         * <p>Lingjun subnet instance name</p>
         * 
         * <strong>example:</strong>
         * <p>yzp-rg-test3</p>
         */
        @NameInMap("SubnetName")
        public String subnetName;

        /**
         * <p>The tag information.</p>
         * <p>You can specify up to 20 tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListSubnetsResponseBodyContentDataTags> tags;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1655449505171</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Lingjun Subnet Usage Type; optional; optional. Valid values:</p>
         * <ul>
         * <li><strong>If you do not set this field for a common type</strong></li>
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
         * <p>vpd basic information</p>
         */
        @NameInMap("VpdBaseInfo")
        public ListSubnetsResponseBodyContentDataVpdBaseInfo vpdBaseInfo;

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

        public static ListSubnetsResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListSubnetsResponseBodyContentData self = new ListSubnetsResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListSubnetsResponseBodyContentData setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListSubnetsResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSubnetsResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListSubnetsResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListSubnetsResponseBodyContentData setNcCount(Integer ncCount) {
            this.ncCount = ncCount;
            return this;
        }
        public Integer getNcCount() {
            return this.ncCount;
        }

        public ListSubnetsResponseBodyContentData setNetworkInterfaceCount(Integer networkInterfaceCount) {
            this.networkInterfaceCount = networkInterfaceCount;
            return this;
        }
        public Integer getNetworkInterfaceCount() {
            return this.networkInterfaceCount;
        }

        public ListSubnetsResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListSubnetsResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListSubnetsResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSubnetsResponseBodyContentData setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public ListSubnetsResponseBodyContentData setSubnetName(String subnetName) {
            this.subnetName = subnetName;
            return this;
        }
        public String getSubnetName() {
            return this.subnetName;
        }

        public ListSubnetsResponseBodyContentData setTags(java.util.List<ListSubnetsResponseBodyContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListSubnetsResponseBodyContentDataTags> getTags() {
            return this.tags;
        }

        public ListSubnetsResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListSubnetsResponseBodyContentData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSubnetsResponseBodyContentData setVpdBaseInfo(ListSubnetsResponseBodyContentDataVpdBaseInfo vpdBaseInfo) {
            this.vpdBaseInfo = vpdBaseInfo;
            return this;
        }
        public ListSubnetsResponseBodyContentDataVpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        public ListSubnetsResponseBodyContentData setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public ListSubnetsResponseBodyContentData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListSubnetsResponseBodyContent extends TeaModel {
        /**
         * <p>Lingjun subnet information list</p>
         */
        @NameInMap("Data")
        public java.util.List<ListSubnetsResponseBodyContentData> data;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSubnetsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListSubnetsResponseBodyContent self = new ListSubnetsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListSubnetsResponseBodyContent setData(java.util.List<ListSubnetsResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListSubnetsResponseBodyContentData> getData() {
            return this.data;
        }

        public ListSubnetsResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
