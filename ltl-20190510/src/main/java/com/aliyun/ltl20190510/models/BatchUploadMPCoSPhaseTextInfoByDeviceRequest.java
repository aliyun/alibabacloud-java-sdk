// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class BatchUploadMPCoSPhaseTextInfoByDeviceRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("IotAuthType")
    public String iotAuthType;

    @NameInMap("IotDataDigest")
    public String iotDataDigest;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotIdServiceProvider")
    public String iotIdServiceProvider;

    @NameInMap("IotIdSource")
    public String iotIdSource;

    @NameInMap("IotSignature")
    public String iotSignature;

    @NameInMap("PhaseDataList")
    public java.util.Map<String, ?> phaseDataList;

    @NameInMap("PhaseGroupId")
    public String phaseGroupId;

    @NameInMap("PhaseId")
    public String phaseId;

    public static BatchUploadMPCoSPhaseTextInfoByDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUploadMPCoSPhaseTextInfoByDeviceRequest self = new BatchUploadMPCoSPhaseTextInfoByDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceRequest setIotAuthType(String iotAuthType) {
        this.iotAuthType = iotAuthType;
        return this;
    }
    public String getIotAuthType() {
        return this.iotAuthType;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceRequest setIotDataDigest(String iotDataDigest) {
        this.iotDataDigest = iotDataDigest;
        return this;
    }
    public String getIotDataDigest() {
        return this.iotDataDigest;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceRequest setIotIdServiceProvider(String iotIdServiceProvider) {
        this.iotIdServiceProvider = iotIdServiceProvider;
        return this;
    }
    public String getIotIdServiceProvider() {
        return this.iotIdServiceProvider;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceRequest setIotIdSource(String iotIdSource) {
        this.iotIdSource = iotIdSource;
        return this;
    }
    public String getIotIdSource() {
        return this.iotIdSource;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceRequest setIotSignature(String iotSignature) {
        this.iotSignature = iotSignature;
        return this;
    }
    public String getIotSignature() {
        return this.iotSignature;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceRequest setPhaseDataList(java.util.Map<String, ?> phaseDataList) {
        this.phaseDataList = phaseDataList;
        return this;
    }
    public java.util.Map<String, ?> getPhaseDataList() {
        return this.phaseDataList;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    public BatchUploadMPCoSPhaseTextInfoByDeviceRequest setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

}
