// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AttachAssetGroupToInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The information about the asset to be associated.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AssetGroupList")
    public String assetGroupListShrink;

    /**
     * <p>The ID of the instance to query.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances of paid editions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-n6w1r7nz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AttachAssetGroupToInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachAssetGroupToInstanceShrinkRequest self = new AttachAssetGroupToInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachAssetGroupToInstanceShrinkRequest setAssetGroupListShrink(String assetGroupListShrink) {
        this.assetGroupListShrink = assetGroupListShrink;
        return this;
    }
    public String getAssetGroupListShrink() {
        return this.assetGroupListShrink;
    }

    public AttachAssetGroupToInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachAssetGroupToInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
