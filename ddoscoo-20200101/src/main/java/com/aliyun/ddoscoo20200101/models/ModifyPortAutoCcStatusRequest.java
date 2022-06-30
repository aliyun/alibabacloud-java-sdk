// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyPortAutoCcStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Switch")
    public String _switch;

    public static ModifyPortAutoCcStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPortAutoCcStatusRequest self = new ModifyPortAutoCcStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPortAutoCcStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPortAutoCcStatusRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ModifyPortAutoCcStatusRequest set_switch(String _switch) {
        this._switch = _switch;
        return this;
    }
    public String get_switch() {
        return this._switch;
    }

}
