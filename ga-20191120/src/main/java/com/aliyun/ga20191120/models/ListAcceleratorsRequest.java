// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAcceleratorsRequest extends TeaModel {
    /**
     * <p>The ID of the Global Accelerator instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
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
     * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the Global Accelerator instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    @Deprecated
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekztkx4zwc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The state of the Global Accelerator instance. Valid values:</p>
     * <ul>
     * <li><p><strong>init</strong>: The instance is being initialized.</p>
     * </li>
     * <li><p><strong>active</strong>: The instance is active.</p>
     * </li>
     * <li><p><strong>configuring</strong>: The instance is being configured.</p>
     * </li>
     * <li><p><strong>binding</strong>: The instance is being bound.</p>
     * </li>
     * <li><p><strong>unbinding</strong>: The instance is being unbound.</p>
     * </li>
     * <li><p><strong>deleting</strong>: The instance is being deleted.</p>
     * </li>
     * <li><p><strong>finacialLocked</strong>: The instance is locked due to an overdue payment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListAcceleratorsRequestTag> tag;

    public static ListAcceleratorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAcceleratorsRequest self = new ListAcceleratorsRequest();
        return TeaModel.build(map, self);
    }

    public ListAcceleratorsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ListAcceleratorsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAcceleratorsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    @Deprecated
    public ListAcceleratorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAcceleratorsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListAcceleratorsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListAcceleratorsRequest setTag(java.util.List<ListAcceleratorsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListAcceleratorsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListAcceleratorsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the Global Accelerator resource. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the Global Accelerator resource. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAcceleratorsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListAcceleratorsRequestTag self = new ListAcceleratorsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListAcceleratorsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAcceleratorsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
