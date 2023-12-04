// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DettachAssetGroupToInstanceShrinkRequest extends TeaModel {
    @NameInMap("AssetGroupList")
    public String assetGroupListShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DettachAssetGroupToInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DettachAssetGroupToInstanceShrinkRequest self = new DettachAssetGroupToInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DettachAssetGroupToInstanceShrinkRequest setAssetGroupListShrink(String assetGroupListShrink) {
        this.assetGroupListShrink = assetGroupListShrink;
        return this;
    }
    public String getAssetGroupListShrink() {
        return this.assetGroupListShrink;
    }

    public DettachAssetGroupToInstanceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DettachAssetGroupToInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DettachAssetGroupToInstanceShrinkRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
