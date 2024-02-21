// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AttachAssetGroupToInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The information about the asset to be associated.</p>
     */
    @NameInMap("AssetGroupList")
    public String assetGroupListShrink;

    /**
     * <p>The ID of the instance to query.</p>
     * <br>
     * <p>>  You can call the [DescribeInstanceList](~~118698~~) operation to query the IDs of all Anti-DDoS Origin instances of paid editions.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source IP address of the request. The system specifies this parameter.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

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

    public AttachAssetGroupToInstanceShrinkRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
