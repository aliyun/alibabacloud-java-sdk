// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBandwidthPackagesRequest extends TeaModel {
    /**
     * <p>The ID of the bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>gbwp-bp1sgzldyj6b4q7cx****</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2ry6mp2c****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: The bandwidth plan is being initialized.</li>
     * <li><strong>active</strong>: The bandwidth plan is available.</li>
     * <li><strong>binded</strong>: The bandwidth plan is associated.</li>
     * <li><strong>binding</strong>: The bandwidth plan is being associated.</li>
     * <li><strong>unbinding</strong>: The bandwidth plan is being disassociated.</li>
     * <li><strong>updating</strong>: The bandwidth plan is being updated.</li>
     * <li><strong>finacialLocked</strong>: The bandwidth plan is locked due to overdue payments.</li>
     * <li><strong>locked</strong>: The bandwidth plan is locked.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The tag of the bandwidth plan.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListBandwidthPackagesRequestTag> tag;

    /**
     * <p>The type of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: a basic bandwidth plan</li>
     * <li><strong>CrossDomain</strong>: a cross-border acceleration bandwidth plan</li>
     * </ul>
     * <p>If you call this operation on the China site (aliyun.com), you can set Type only to <strong>Basic</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListBandwidthPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBandwidthPackagesRequest self = new ListBandwidthPackagesRequest();
        return TeaModel.build(map, self);
    }

    public ListBandwidthPackagesRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public ListBandwidthPackagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBandwidthPackagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBandwidthPackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListBandwidthPackagesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListBandwidthPackagesRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListBandwidthPackagesRequest setTag(java.util.List<ListBandwidthPackagesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListBandwidthPackagesRequestTag> getTag() {
        return this.tag;
    }

    public ListBandwidthPackagesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListBandwidthPackagesRequestTag extends TeaModel {
        /**
         * <p>The tag key of the bandwidth plan. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the bandwidth plan. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * <p>You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListBandwidthPackagesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListBandwidthPackagesRequestTag self = new ListBandwidthPackagesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListBandwidthPackagesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListBandwidthPackagesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
