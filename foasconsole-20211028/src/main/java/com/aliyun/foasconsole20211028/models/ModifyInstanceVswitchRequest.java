// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyInstanceVswitchRequest extends TeaModel {
    @NameInMap("HaVSwitchIds")
    public java.util.List<String> haVSwitchIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sc_flinkserverless_public_cn-7e22ae****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    public static ModifyInstanceVswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVswitchRequest self = new ModifyInstanceVswitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVswitchRequest setHaVSwitchIds(java.util.List<String> haVSwitchIds) {
        this.haVSwitchIds = haVSwitchIds;
        return this;
    }
    public java.util.List<String> getHaVSwitchIds() {
        return this.haVSwitchIds;
    }

    public ModifyInstanceVswitchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceVswitchRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

}
