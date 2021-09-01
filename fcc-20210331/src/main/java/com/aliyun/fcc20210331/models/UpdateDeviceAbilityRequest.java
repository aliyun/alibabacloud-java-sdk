// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateDeviceAbilityRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("AbilityType")
    public String abilityType;

    @NameInMap("AbilityName")
    public String abilityName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ConfigInfo")
    public String configInfo;

    public static UpdateDeviceAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceAbilityRequest self = new UpdateDeviceAbilityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceAbilityRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UpdateDeviceAbilityRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UpdateDeviceAbilityRequest setAbilityType(String abilityType) {
        this.abilityType = abilityType;
        return this;
    }
    public String getAbilityType() {
        return this.abilityType;
    }

    public UpdateDeviceAbilityRequest setAbilityName(String abilityName) {
        this.abilityName = abilityName;
        return this;
    }
    public String getAbilityName() {
        return this.abilityName;
    }

    public UpdateDeviceAbilityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDeviceAbilityRequest setConfigInfo(String configInfo) {
        this.configInfo = configInfo;
        return this;
    }
    public String getConfigInfo() {
        return this.configInfo;
    }

}
