// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClustersShrinkRequest extends TeaModel {
    /**
     * <p>The configurations of the cluster.</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public String tagShrink;

    public static DescribeHubClustersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClustersShrinkRequest self = new DescribeHubClustersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHubClustersShrinkRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public DescribeHubClustersShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeHubClustersShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
