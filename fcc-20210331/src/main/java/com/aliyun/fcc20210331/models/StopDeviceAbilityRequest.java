// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class StopDeviceAbilityRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("AbilityType")
    public String abilityType;

    @NameInMap("AbilityName")
    public String abilityName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AlgorithmId")
    public String algorithmId;

    public static StopDeviceAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDeviceAbilityRequest self = new StopDeviceAbilityRequest();
        return TeaModel.build(map, self);
    }

    public StopDeviceAbilityRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public StopDeviceAbilityRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public StopDeviceAbilityRequest setAbilityType(String abilityType) {
        this.abilityType = abilityType;
        return this;
    }
    public String getAbilityType() {
        return this.abilityType;
    }

    public StopDeviceAbilityRequest setAbilityName(String abilityName) {
        this.abilityName = abilityName;
        return this;
    }
    public String getAbilityName() {
        return this.abilityName;
    }

    public StopDeviceAbilityRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StopDeviceAbilityRequest setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

}
