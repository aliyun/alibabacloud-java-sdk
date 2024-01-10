// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class StartPTDetectionRequest extends TeaModel {
    @NameInMap("AlgorithmInstanceUid")
    public String algorithmInstanceUid;

    @NameInMap("Data")
    public String data;

    @NameInMap("DataCollectionTime")
    public Long dataCollectionTime;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PowerPlantsNumber")
    public Integer powerPlantsNumber;

    @NameInMap("PowerStationUid")
    public String powerStationUid;

    @NameInMap("Sensitivity")
    public Integer sensitivity;

    public static StartPTDetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPTDetectionRequest self = new StartPTDetectionRequest();
        return TeaModel.build(map, self);
    }

    public StartPTDetectionRequest setAlgorithmInstanceUid(String algorithmInstanceUid) {
        this.algorithmInstanceUid = algorithmInstanceUid;
        return this;
    }
    public String getAlgorithmInstanceUid() {
        return this.algorithmInstanceUid;
    }

    public StartPTDetectionRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public StartPTDetectionRequest setDataCollectionTime(Long dataCollectionTime) {
        this.dataCollectionTime = dataCollectionTime;
        return this;
    }
    public Long getDataCollectionTime() {
        return this.dataCollectionTime;
    }

    public StartPTDetectionRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public StartPTDetectionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public StartPTDetectionRequest setPowerPlantsNumber(Integer powerPlantsNumber) {
        this.powerPlantsNumber = powerPlantsNumber;
        return this;
    }
    public Integer getPowerPlantsNumber() {
        return this.powerPlantsNumber;
    }

    public StartPTDetectionRequest setPowerStationUid(String powerStationUid) {
        this.powerStationUid = powerStationUid;
        return this;
    }
    public String getPowerStationUid() {
        return this.powerStationUid;
    }

    public StartPTDetectionRequest setSensitivity(Integer sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }
    public Integer getSensitivity() {
        return this.sensitivity;
    }

}
