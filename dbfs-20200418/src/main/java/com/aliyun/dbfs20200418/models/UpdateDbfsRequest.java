// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class UpdateDbfsRequest extends TeaModel {
    @NameInMap("AdvancedFeatures")
    public String advancedFeatures;

    @NameInMap("FsId")
    public String fsId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UsedScene")
    public String usedScene;

    public static UpdateDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDbfsRequest self = new UpdateDbfsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDbfsRequest setAdvancedFeatures(String advancedFeatures) {
        this.advancedFeatures = advancedFeatures;
        return this;
    }
    public String getAdvancedFeatures() {
        return this.advancedFeatures;
    }

    public UpdateDbfsRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

    public UpdateDbfsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpdateDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDbfsRequest setUsedScene(String usedScene) {
        this.usedScene = usedScene;
        return this;
    }
    public String getUsedScene() {
        return this.usedScene;
    }

}
