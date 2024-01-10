// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AddPowerStationRequest extends TeaModel {
    @NameInMap("AlgorithmInstanceUid")
    public String algorithmInstanceUid;

    @NameInMap("Description")
    public String description;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PowerStationName")
    public String powerStationName;

    @NameInMap("RatedPower")
    public Integer ratedPower;

    public static AddPowerStationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPowerStationRequest self = new AddPowerStationRequest();
        return TeaModel.build(map, self);
    }

    public AddPowerStationRequest setAlgorithmInstanceUid(String algorithmInstanceUid) {
        this.algorithmInstanceUid = algorithmInstanceUid;
        return this;
    }
    public String getAlgorithmInstanceUid() {
        return this.algorithmInstanceUid;
    }

    public AddPowerStationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddPowerStationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public AddPowerStationRequest setPowerStationName(String powerStationName) {
        this.powerStationName = powerStationName;
        return this;
    }
    public String getPowerStationName() {
        return this.powerStationName;
    }

    public AddPowerStationRequest setRatedPower(Integer ratedPower) {
        this.ratedPower = ratedPower;
        return this;
    }
    public Integer getRatedPower() {
        return this.ratedPower;
    }

}
