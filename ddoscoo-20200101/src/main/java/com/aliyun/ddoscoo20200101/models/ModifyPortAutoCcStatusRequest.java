// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyPortAutoCcStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Switch")
    public String _switch;

    @NameInMap("Mode")
    public String mode;

    public static ModifyPortAutoCcStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPortAutoCcStatusRequest self = new ModifyPortAutoCcStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPortAutoCcStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyPortAutoCcStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyPortAutoCcStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPortAutoCcStatusRequest set_switch(String _switch) {
        this._switch = _switch;
        return this;
    }
    public String get_switch() {
        return this._switch;
    }

    public ModifyPortAutoCcStatusRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
