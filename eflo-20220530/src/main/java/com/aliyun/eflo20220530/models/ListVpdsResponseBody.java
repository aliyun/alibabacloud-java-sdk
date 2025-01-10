// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdsResponseBody extends TeaModel {
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
    public ListVpdsResponseBodyContent content;

    /**
     * <p>The additional information that is returned.</p>
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
     * <p>9C50C9CD-E799-54DA-BA7A-1FAF3DF80857</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVpdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpdsResponseBody self = new ListVpdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpdsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListVpdsResponseBody setContent(ListVpdsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVpdsResponseBodyContent getContent() {
        return this.content;
    }

    public ListVpdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVpdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVpdsResponseBodyContentDataErInfos extends TeaModel {
        /**
         * <p>The number of connections.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Connections")
        public Long connections;

        /**
         * <p>The time when the activation code was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-26 20:16:36</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>No description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the Elastic Router (ER) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>er-63vzm0fw</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>The name of the Lingjun HUB(ER) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>er-1</p>
         */
        @NameInMap("ErName")
        public String erName;

        /**
         * <p>The time when the O\&amp;M task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-26 20:16:36</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The primary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("MasterZoneId")
        public String masterZoneId;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The supported region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RouteMaps")
        public Long routeMaps;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static ListVpdsResponseBodyContentDataErInfos build(java.util.Map<String, ?> map) throws Exception {
            ListVpdsResponseBodyContentDataErInfos self = new ListVpdsResponseBodyContentDataErInfos();
            return TeaModel.build(map, self);
        }

        public ListVpdsResponseBodyContentDataErInfos setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public ListVpdsResponseBodyContentDataErInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVpdsResponseBodyContentDataErInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVpdsResponseBodyContentDataErInfos setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public ListVpdsResponseBodyContentDataErInfos setErName(String erName) {
            this.erName = erName;
            return this;
        }
        public String getErName() {
            return this.erName;
        }

        public ListVpdsResponseBodyContentDataErInfos setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListVpdsResponseBodyContentDataErInfos setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public ListVpdsResponseBodyContentDataErInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListVpdsResponseBodyContentDataErInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpdsResponseBodyContentDataErInfos setRouteMaps(Long routeMaps) {
            this.routeMaps = routeMaps;
            return this;
        }
        public Long getRouteMaps() {
            return this.routeMaps;
        }

        public ListVpdsResponseBodyContentDataErInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVpdsResponseBodyContentDataErInfos setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListVpdsResponseBodyContentDataTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-vpd-region</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag that is added to the resource.</p>
         * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListVpdsResponseBodyContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListVpdsResponseBodyContentDataTags self = new ListVpdsResponseBodyContentDataTags();
            return TeaModel.build(map, self);
        }

        public ListVpdsResponseBodyContentDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListVpdsResponseBodyContentDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListVpdsResponseBodyContentData extends TeaModel {
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
         * <p>Dependencies.</p>
         */
        @NameInMap("Dependence")
        public java.util.Map<String, ?> dependence;

        /**
         * <p>The information list of the bound Lingjun HUB(ER).</p>
         */
        @NameInMap("ErInfos")
        public java.util.List<ListVpdsResponseBodyContentDataErInfos> erInfos;

        /**
         * <p>The time when the O\&amp;M task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>nc quantity.</p>
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
         * <p>The list of additional CIDR blocks.</p>
         */
        @NameInMap("SecondaryCidrBlocks")
        public java.util.List<String> secondaryCidrBlocks;

        /**
         * <p>The Service CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.252.0/23</p>
         */
        @NameInMap("ServiceCidr")
        public String serviceCidr;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of subnets.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubnetCount")
        public Integer subnetCount;

        /**
         * <p>The tag information.</p>
         * <p>You can specify up to 20 tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVpdsResponseBodyContentDataTags> tags;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1655449505171</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The ID of the VPD instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-lg4dppgi</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>The name of the VPD.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-1</p>
         */
        @NameInMap("VpdName")
        public String vpdName;

        public static ListVpdsResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListVpdsResponseBodyContentData self = new ListVpdsResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListVpdsResponseBodyContentData setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListVpdsResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVpdsResponseBodyContentData setDependence(java.util.Map<String, ?> dependence) {
            this.dependence = dependence;
            return this;
        }
        public java.util.Map<String, ?> getDependence() {
            return this.dependence;
        }

        public ListVpdsResponseBodyContentData setErInfos(java.util.List<ListVpdsResponseBodyContentDataErInfos> erInfos) {
            this.erInfos = erInfos;
            return this;
        }
        public java.util.List<ListVpdsResponseBodyContentDataErInfos> getErInfos() {
            return this.erInfos;
        }

        public ListVpdsResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListVpdsResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListVpdsResponseBodyContentData setNcCount(Integer ncCount) {
            this.ncCount = ncCount;
            return this;
        }
        public Integer getNcCount() {
            return this.ncCount;
        }

        public ListVpdsResponseBodyContentData setNetworkInterfaceCount(Integer networkInterfaceCount) {
            this.networkInterfaceCount = networkInterfaceCount;
            return this;
        }
        public Integer getNetworkInterfaceCount() {
            return this.networkInterfaceCount;
        }

        public ListVpdsResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpdsResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVpdsResponseBodyContentData setSecondaryCidrBlocks(java.util.List<String> secondaryCidrBlocks) {
            this.secondaryCidrBlocks = secondaryCidrBlocks;
            return this;
        }
        public java.util.List<String> getSecondaryCidrBlocks() {
            return this.secondaryCidrBlocks;
        }

        public ListVpdsResponseBodyContentData setServiceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        public ListVpdsResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVpdsResponseBodyContentData setSubnetCount(Integer subnetCount) {
            this.subnetCount = subnetCount;
            return this;
        }
        public Integer getSubnetCount() {
            return this.subnetCount;
        }

        public ListVpdsResponseBodyContentData setTags(java.util.List<ListVpdsResponseBodyContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVpdsResponseBodyContentDataTags> getTags() {
            return this.tags;
        }

        public ListVpdsResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListVpdsResponseBodyContentData setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public ListVpdsResponseBodyContentData setVpdName(String vpdName) {
            this.vpdName = vpdName;
            return this;
        }
        public String getVpdName() {
            return this.vpdName;
        }

    }

    public static class ListVpdsResponseBodyContent extends TeaModel {
        /**
         * <p>The returned data.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListVpdsResponseBodyContentData> data;

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListVpdsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListVpdsResponseBodyContent self = new ListVpdsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListVpdsResponseBodyContent setData(java.util.List<ListVpdsResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListVpdsResponseBodyContentData> getData() {
            return this.data;
        }

        public ListVpdsResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
