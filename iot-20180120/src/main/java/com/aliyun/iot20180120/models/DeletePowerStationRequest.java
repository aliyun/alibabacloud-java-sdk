// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeletePowerStationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlgorithmInstanceUid")
    public String algorithmInstanceUid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PowerStationUid")
    public String powerStationUid;

    public static DeletePowerStationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePowerStationRequest self = new DeletePowerStationRequest();
        return TeaModel.build(map, self);
    }

    public DeletePowerStationRequest setAlgorithmInstanceUid(String algorithmInstanceUid) {
        this.algorithmInstanceUid = algorithmInstanceUid;
        return this;
    }
    public String getAlgorithmInstanceUid() {
        return this.algorithmInstanceUid;
    }

    public DeletePowerStationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeletePowerStationRequest setPowerStationUid(String powerStationUid) {
        this.powerStationUid = powerStationUid;
        return this;
    }
    public String getPowerStationUid() {
        return this.powerStationUid;
    }

}
