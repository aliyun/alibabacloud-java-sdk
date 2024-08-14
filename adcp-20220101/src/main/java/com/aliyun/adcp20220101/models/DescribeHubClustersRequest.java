// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClustersRequest extends TeaModel {
    /**
     * <p>The configurations of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz77rhypeu***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    public static DescribeHubClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClustersRequest self = new DescribeHubClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHubClustersRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public DescribeHubClustersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeHubClustersRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

}
