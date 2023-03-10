// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBizBandWidthModeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mode")
    public String mode;

    public static ModifyBizBandWidthModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBizBandWidthModeRequest self = new ModifyBizBandWidthModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBizBandWidthModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyBizBandWidthModeRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
