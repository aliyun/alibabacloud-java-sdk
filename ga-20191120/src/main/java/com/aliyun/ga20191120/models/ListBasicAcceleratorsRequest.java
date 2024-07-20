// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAcceleratorsRequest extends TeaModel {
    /**
     * <p>The ID of the basic GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region to which the basic GA instance belongs. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the basic GA instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzrnd67gq****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The state of the basic GA instance. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: The basic GA instance is being initialized.</li>
     * <li><strong>active</strong>: The basic GA instance is available.</li>
     * <li><strong>configuring</strong>: The basic GA instance is being configured.</li>
     * <li><strong>binding</strong>: The basic GA instance is being associated.</li>
     * <li><strong>unbinding</strong>: The basic GA instance is being disassociated.</li>
     * <li><strong>deleting</strong>: The basic GA instance is being deleted.</li>
     * <li><strong>finacialLocked</strong>: The basic GA instance is locked due to overdue payments.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The tags of the GA instance.</p>
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
         * <p>The key of tag N of the basic GA instance. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>Keytest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the basic GA instance. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * <p>You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>Valuetest</p>
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
