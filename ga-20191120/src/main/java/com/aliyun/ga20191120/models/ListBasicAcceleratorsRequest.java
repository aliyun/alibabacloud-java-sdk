// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAcceleratorsRequest extends TeaModel {
    /**
     * <p>The ID of the basic GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region to which the basic GA instance belongs. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the basic GA instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The state of the basic GA instance. Valid values:</p>
     * <br>
     * <p>*   **init**: The basic GA instance is being initialized.</p>
     * <p>*   **active**: The basic GA instance is available.</p>
     * <p>*   **configuring**: The basic GA instance is being configured.</p>
     * <p>*   **binding**: The basic GA instance is being associated.</p>
     * <p>*   **unbinding**: The basic GA instance is being disassociated.</p>
     * <p>*   **deleting**: The basic GA instance is being deleted.</p>
     * <p>*   **finacialLocked**: The basic GA instance is locked due to overdue payments.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The tags of the basic GA instance.</p>
     * <p>You can specify at most 20 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListBasicAcceleratorsRequestTag> tag;

    public static ListBasicAcceleratorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAcceleratorsRequest self = new ListBasicAcceleratorsRequest();
        return TeaModel.build(map, self);
    }

    public ListBasicAcceleratorsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ListBasicAcceleratorsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBasicAcceleratorsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBasicAcceleratorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListBasicAcceleratorsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListBasicAcceleratorsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListBasicAcceleratorsRequest setTag(java.util.List<ListBasicAcceleratorsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListBasicAcceleratorsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListBasicAcceleratorsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the basic GA resource. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         * <br>
         * <p>You can specify up to 20 tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the basic GA instance. The tag value cannot be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         * <br>
         * <p>You can specify up to 20 tag values.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListBasicAcceleratorsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAcceleratorsRequestTag self = new ListBasicAcceleratorsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListBasicAcceleratorsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListBasicAcceleratorsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
