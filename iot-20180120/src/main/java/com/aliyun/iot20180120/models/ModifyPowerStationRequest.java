// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ModifyPowerStationRequest extends TeaModel {
    @NameInMap("AlgorithmInstanceUid")
    public String algorithmInstanceUid;

    @NameInMap("Description")
    public String description;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PowerStationName")
    public String powerStationName;

    @NameInMap("PowerStationUid")
    public String powerStationUid;

    @NameInMap("RatedPower")
    public Integer ratedPower;

    public static ModifyPowerStationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPowerStationRequest self = new ModifyPowerStationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPowerStationRequest setAlgorithmInstanceUid(String algorithmInstanceUid) {
        this.algorithmInstanceUid = algorithmInstanceUid;
        return this;
    }
    public String getAlgorithmInstanceUid() {
        return this.algorithmInstanceUid;
    }

    public ModifyPowerStationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPowerStationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ModifyPowerStationRequest setPowerStationName(String powerStationName) {
        this.powerStationName = powerStationName;
        return this;
    }
    public String getPowerStationName() {
        return this.powerStationName;
    }

    public ModifyPowerStationRequest setPowerStationUid(String powerStationUid) {
        this.powerStationUid = powerStationUid;
        return this;
    }
    public String getPowerStationUid() {
        return this.powerStationUid;
    }

    public ModifyPowerStationRequest setRatedPower(Integer ratedPower) {
        this.ratedPower = ratedPower;
        return this;
    }
    public Integer getRatedPower() {
        return this.ratedPower;
    }

}
