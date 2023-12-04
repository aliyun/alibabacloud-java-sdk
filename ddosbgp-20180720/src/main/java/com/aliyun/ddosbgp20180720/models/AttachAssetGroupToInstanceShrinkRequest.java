// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AttachAssetGroupToInstanceShrinkRequest extends TeaModel {
    @NameInMap("AssetGroupList")
    public String assetGroupListShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

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
