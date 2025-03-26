// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVpdResponseBody extends TeaModel {
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
     * <p>The data returned.</p>
     */
    @NameInMap("Content")
    public GetVpdResponseBodyContent content;

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
     * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVpdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpdResponseBody self = new GetVpdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpdResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetVpdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVpdResponseBody setContent(GetVpdResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetVpdResponseBodyContent getContent() {
        return this.content;
    }

    public GetVpdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVpdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVpdResponseBodyContentErInfos extends TeaModel {
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
         * <p>1678273219000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>Restore verifying</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the Elastic Router (ER) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>er-a7rqv1rq</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>Elastic Router (ER) Instance Name</p>
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
         * <p>1678273219000</p>
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
         * <p>The ID of the region to which the Elastic Router (ER) belongs.</p>
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
         * <p>t464p4fql1bog</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static GetVpdResponseBodyContentErInfos build(java.util.Map<String, ?> map) throws Exception {
            GetVpdResponseBodyContentErInfos self = new GetVpdResponseBodyContentErInfos();
            return TeaModel.build(map, self);
        }

        public GetVpdResponseBodyContentErInfos setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public GetVpdResponseBodyContentErInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetVpdResponseBodyContentErInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVpdResponseBodyContentErInfos setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetVpdResponseBodyContentErInfos setErName(String erName) {
            this.erName = erName;
            return this;
        }
        public String getErName() {
            return this.erName;
        }

        public GetVpdResponseBodyContentErInfos setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetVpdResponseBodyContentErInfos setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public GetVpdResponseBodyContentErInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetVpdResponseBodyContentErInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVpdResponseBodyContentErInfos setRouteMaps(Long routeMaps) {
            this.routeMaps = routeMaps;
            return this;
        }
        public Long getRouteMaps() {
            return this.routeMaps;
        }

        public GetVpdResponseBodyContentErInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVpdResponseBodyContentErInfos setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class GetVpdResponseBodyContentTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-subent-region</p>
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

        public static GetVpdResponseBodyContentTags build(java.util.Map<String, ?> map) throws Exception {
            GetVpdResponseBodyContentTags self = new GetVpdResponseBodyContentTags();
            return TeaModel.build(map, self);
        }

        public GetVpdResponseBodyContentTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetVpdResponseBodyContentTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetVpdResponseBodyContent extends TeaModel {
        /**
         * <p>Whether the Lingjun HUB(ER) has been bound.</p>
         * <ul>
         * <li><strong>true</strong>: ER is bound.</li>
         * <li><strong>false</strong>: No ER is bound.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AttachErStatus")
        public Boolean attachErStatus;

        /**
         * <p>The CIDR block.</p>
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
         * <p>The information of the bound Lingjun HUB(ER).</p>
         */
        @NameInMap("ErInfos")
        public java.util.List<GetVpdResponseBodyContentErInfos> erInfos;

        /**
         * <p>The time when the O\&amp;M task was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-25 15:57:16</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
         * <p>Number of Lingjun network interface controller.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetworkInterfaceCount")
        public Integer networkInterfaceCount;

        /**
         * <p>The total number of secondary private IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PrivateIpCount")
        public Long privateIpCount;

        /**
         * <p>The total quota information.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>Internal Service CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.252.0/23</p>
         */
        @NameInMap("ServiceCidr")
        public String serviceCidr;

        /**
         * <p>The current state of the instance.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Not Available: Not Available.</li>
         * <li>Available: Normal: Available: Normal.</li>
         * <li>Deleting: Deleting: Deleting: Deleting.</li>
         * <li>Executing: executing: Executing: executing.</li>
         * </ul>
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
        public Long subnetCount;

        /**
         * <p>The tag information.</p>
         * <p>You can specify up to 20 tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetVpdResponseBodyContentTags> tags;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166279</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The ID of the VPD instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-fuliephf</p>
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

        public static GetVpdResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetVpdResponseBodyContent self = new GetVpdResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetVpdResponseBodyContent setAttachErStatus(Boolean attachErStatus) {
            this.attachErStatus = attachErStatus;
            return this;
        }
        public Boolean getAttachErStatus() {
            return this.attachErStatus;
        }

        public GetVpdResponseBodyContent setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetVpdResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetVpdResponseBodyContent setErInfos(java.util.List<GetVpdResponseBodyContentErInfos> erInfos) {
            this.erInfos = erInfos;
            return this;
        }
        public java.util.List<GetVpdResponseBodyContentErInfos> getErInfos() {
            return this.erInfos;
        }

        public GetVpdResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetVpdResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetVpdResponseBodyContent setNcCount(Integer ncCount) {
            this.ncCount = ncCount;
            return this;
        }
        public Integer getNcCount() {
            return this.ncCount;
        }

        public GetVpdResponseBodyContent setNetworkInterfaceCount(Integer networkInterfaceCount) {
            this.networkInterfaceCount = networkInterfaceCount;
            return this;
        }
        public Integer getNetworkInterfaceCount() {
            return this.networkInterfaceCount;
        }

        public GetVpdResponseBodyContent setPrivateIpCount(Long privateIpCount) {
            this.privateIpCount = privateIpCount;
            return this;
        }
        public Long getPrivateIpCount() {
            return this.privateIpCount;
        }

        public GetVpdResponseBodyContent setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public GetVpdResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVpdResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetVpdResponseBodyContent setSecondaryCidrBlocks(java.util.List<String> secondaryCidrBlocks) {
            this.secondaryCidrBlocks = secondaryCidrBlocks;
            return this;
        }
        public java.util.List<String> getSecondaryCidrBlocks() {
            return this.secondaryCidrBlocks;
        }

        public GetVpdResponseBodyContent setServiceCidr(String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        public GetVpdResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVpdResponseBodyContent setSubnetCount(Long subnetCount) {
            this.subnetCount = subnetCount;
            return this;
        }
        public Long getSubnetCount() {
            return this.subnetCount;
        }

        public GetVpdResponseBodyContent setTags(java.util.List<GetVpdResponseBodyContentTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetVpdResponseBodyContentTags> getTags() {
            return this.tags;
        }

        public GetVpdResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetVpdResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public GetVpdResponseBodyContent setVpdName(String vpdName) {
            this.vpdName = vpdName;
            return this;
        }
        public String getVpdName() {
            return this.vpdName;
        }

    }

}
