// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccsRequest extends TeaModel {
    /**
     * <p>The peak bandwidth of the Lingjun connection instance. Unit: Mbit/s. Valid values: 1000 to 400000</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the CEN instance; <a href="https://help.aliyun.com/document_detail/181681.html">What is the CEN?</a></p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/468215.htm">DescribeCens</a> to query the information of CEN instances under the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-95iwtpyvj3kk1v0ao0</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>Specifies whether to enable paged query. Optional values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable pagination query</li>
     * <li><strong>false</strong>: Pagination query is disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePage")
    public Boolean enablePage;

    /**
     * <p>Excludes all data in the specified status. If the status parameter exists, ExStatus does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("ExStatus")
    public String exStatus;

    /**
     * <p>Filter queries by Lingjun HUB instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>er-a7rqv1rq</p>
     */
    @NameInMap("FilterErId")
    public String filterErId;

    /**
     * <p>The page number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm?spm=a2c4g.11186623.0.0.29e15d7akXhpuu">Resource groups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aeky5f3qx6ceapq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag information.</p>
     * <p>You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListVccsRequestTag> tag;

    /**
     * <p>The ID of the Lingjun connection instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-zvp2w222001</p>
     */
    @NameInMap("VccId")
    public String vccId;

    /**
     * <p>Virtual Private Cloud IDs; <a href="https://help.aliyun.com/document_detail/34217.html">What is Virtual Private Cloud</a></p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/35739.html#demo-0">DescribeVpcs</a> operation to query the specified VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nrtkmamy329u6a1z0i</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Lingjun CIDR block instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-omqutbff</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    public static ListVccsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVccsRequest self = new ListVccsRequest();
        return TeaModel.build(map, self);
    }

    public ListVccsRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public ListVccsRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ListVccsRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListVccsRequest setExStatus(String exStatus) {
        this.exStatus = exStatus;
        return this;
    }
    public String getExStatus() {
        return this.exStatus;
    }

    public ListVccsRequest setFilterErId(String filterErId) {
        this.filterErId = filterErId;
        return this;
    }
    public String getFilterErId() {
        return this.filterErId;
    }

    public ListVccsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVccsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVccsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVccsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVccsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListVccsRequest setTag(java.util.List<ListVccsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListVccsRequestTag> getTag() {
        return this.tag;
    }

    public ListVccsRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

    public ListVccsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ListVccsRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public static class ListVccsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the VPN attachment.</p>
         * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-vcc</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the VPN connection.</p>
         * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-group-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVccsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListVccsRequestTag self = new ListVccsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListVccsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVccsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
