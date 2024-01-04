// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTimingSyntheticTasksShrinkRequest extends TeaModel {
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
     * <p>The search keyword.</p>
     */
    @NameInMap("Search")
    public String searchShrink;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static ListTimingSyntheticTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTimingSyntheticTasksShrinkRequest self = new ListTimingSyntheticTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTimingSyntheticTasksShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTimingSyntheticTasksShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTimingSyntheticTasksShrinkRequest setSearchShrink(String searchShrink) {
        this.searchShrink = searchShrink;
        return this;
    }
    public String getSearchShrink() {
        return this.searchShrink;
    }

    public ListTimingSyntheticTasksShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
