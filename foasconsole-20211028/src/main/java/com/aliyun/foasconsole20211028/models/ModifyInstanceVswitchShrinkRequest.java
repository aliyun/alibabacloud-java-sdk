// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyInstanceVswitchShrinkRequest extends TeaModel {
    @NameInMap("HaVSwitchIds")
    public String haVSwitchIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sc_flinkserverless_public_cn-7e22ae****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VSwitchIds")
    public String vSwitchIdsShrink;

    public static ModifyInstanceVswitchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVswitchShrinkRequest self = new ModifyInstanceVswitchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVswitchShrinkRequest setHaVSwitchIdsShrink(String haVSwitchIdsShrink) {
        this.haVSwitchIdsShrink = haVSwitchIdsShrink;
        return this;
    }
    public String getHaVSwitchIdsShrink() {
        return this.haVSwitchIdsShrink;
    }

    public ModifyInstanceVswitchShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceVswitchShrinkRequest setVSwitchIdsShrink(String vSwitchIdsShrink) {
        this.vSwitchIdsShrink = vSwitchIdsShrink;
        return this;
    }
    public String getVSwitchIdsShrink() {
        return this.vSwitchIdsShrink;
    }

}
