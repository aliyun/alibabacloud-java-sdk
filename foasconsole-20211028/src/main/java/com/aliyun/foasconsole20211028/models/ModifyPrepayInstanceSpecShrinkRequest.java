// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecShrinkRequest extends TeaModel {
    @NameInMap("Ha")
    public Boolean ha;

    @NameInMap("HaResourceSpec")
    public String haResourceSpecShrink;

    @NameInMap("HaVSwitchIds")
    public String haVSwitchIdsShrink;

    @NameInMap("HaZoneId")
    public String haZoneId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceSpec")
    public String resourceSpecShrink;

    public static ModifyPrepayInstanceSpecShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecShrinkRequest self = new ModifyPrepayInstanceSpecShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecShrinkRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public ModifyPrepayInstanceSpecShrinkRequest setHaResourceSpecShrink(String haResourceSpecShrink) {
        this.haResourceSpecShrink = haResourceSpecShrink;
        return this;
    }
    public String getHaResourceSpecShrink() {
        return this.haResourceSpecShrink;
    }

    public ModifyPrepayInstanceSpecShrinkRequest setHaVSwitchIdsShrink(String haVSwitchIdsShrink) {
        this.haVSwitchIdsShrink = haVSwitchIdsShrink;
        return this;
    }
    public String getHaVSwitchIdsShrink() {
        return this.haVSwitchIdsShrink;
    }

    public ModifyPrepayInstanceSpecShrinkRequest setHaZoneId(String haZoneId) {
        this.haZoneId = haZoneId;
        return this;
    }
    public String getHaZoneId() {
        return this.haZoneId;
    }

    public ModifyPrepayInstanceSpecShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPrepayInstanceSpecShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyPrepayInstanceSpecShrinkRequest setResourceSpecShrink(String resourceSpecShrink) {
        this.resourceSpecShrink = resourceSpecShrink;
        return this;
    }
    public String getResourceSpecShrink() {
        return this.resourceSpecShrink;
    }

}
