// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentsShrinkRequest extends TeaModel {
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
    public String tagShrink;

    public static ListEnvironmentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsShrinkRequest self = new ListEnvironmentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsShrinkRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public ListEnvironmentsShrinkRequest setEnvironmentType(String environmentType) {
        this.environmentType = environmentType;
        return this;
    }
    public String getEnvironmentType() {
        return this.environmentType;
    }

    public ListEnvironmentsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEnvironmentsShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListEnvironmentsShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
