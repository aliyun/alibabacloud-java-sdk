// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentsRequest extends TeaModel {
    /**
     * <p>Name of Addon.</p>
     */
    @NameInMap("AddonName")
    public String addonName;

    /**
     * <p>Environment type, AddonName or EnvironmentType must be at least one.</p>
     */
    @NameInMap("EnvironmentType")
    public String environmentType;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Resource tag list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListEnvironmentsRequestTag> tag;

    public static ListEnvironmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsRequest self = new ListEnvironmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public ListEnvironmentsRequest setEnvironmentType(String environmentType) {
        this.environmentType = environmentType;
        return this;
    }
    public String getEnvironmentType() {
        return this.environmentType;
    }

    public ListEnvironmentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEnvironmentsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListEnvironmentsRequest setTag(java.util.List<ListEnvironmentsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListEnvironmentsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListEnvironmentsRequestTag extends TeaModel {
        /**
         * <p>Tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEnvironmentsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsRequestTag self = new ListEnvironmentsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEnvironmentsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
