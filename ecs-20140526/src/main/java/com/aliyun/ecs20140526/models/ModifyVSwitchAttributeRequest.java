// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyVSwitchAttributeRequest extends TeaModel {
    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("VSwitchName")
    public String vSwitchName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Description")
    public String description;

    public static ModifyVSwitchAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVSwitchAttributeRequest self = new ModifyVSwitchAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVSwitchAttributeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyVSwitchAttributeRequest setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public ModifyVSwitchAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVSwitchAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
