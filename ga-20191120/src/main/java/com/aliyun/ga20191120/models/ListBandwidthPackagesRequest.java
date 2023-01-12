// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBandwidthPackagesRequest extends TeaModel {
    /**
     * <p>The ID of the bandwidth plan.</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **100**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The state of the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **init**: The bandwidth plan is being initialized.</p>
     * <p>*   **active**: The bandwidth plan is available.</p>
     * <p>*   **binded**: The bandwidth plan is associated with a GA instance.</p>
     * <p>*   **binding**: The bandwidth plan is being associated.</p>
     * <p>*   **unbinding**: The bandwidth plan is being disassociated.</p>
     * <p>*   **updating**: The bandwidth plan is being updated.</p>
     * <p>*   **finacialLocked**: The bandwidth plan is locked due to overdue payments.</p>
     * <p>*   **Locked**: The bandwidth plan is locked.</p>
     */
    @NameInMap("State")
    public String state;

    @NameInMap("Tag")
    public java.util.List<ListBandwidthPackagesRequestTag> tag;

    /**
     * <p>The type of the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **Basic**: a basic bandwidth plan</p>
     * <p>*   **CrossDomain**: a cross-region acceleration bandwidth plan</p>
     * <br>
     * <p>If you call this operation on the Alibaba Cloud China Site (aliyun.com), you can only set Type to **Basic**.</p>
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
        @NameInMap("Key")
        public String key;

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
