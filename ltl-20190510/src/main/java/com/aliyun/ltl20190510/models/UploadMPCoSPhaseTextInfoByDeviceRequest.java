// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UploadMPCoSPhaseTextInfoByDeviceRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("DataKey")
    public String dataKey;

    @NameInMap("DataSeq")
    public String dataSeq;

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

    @NameInMap("PhaseData")
    public String phaseData;

    @NameInMap("PhaseGroupId")
    public String phaseGroupId;

    @NameInMap("PhaseId")
    public String phaseId;

    @NameInMap("RelatedDataList")
    public java.util.Map<String, ?> relatedDataList;

    public static UploadMPCoSPhaseTextInfoByDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMPCoSPhaseTextInfoByDeviceRequest self = new UploadMPCoSPhaseTextInfoByDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setDataKey(String dataKey) {
        this.dataKey = dataKey;
        return this;
    }
    public String getDataKey() {
        return this.dataKey;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setDataSeq(String dataSeq) {
        this.dataSeq = dataSeq;
        return this;
    }
    public String getDataSeq() {
        return this.dataSeq;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setIotAuthType(String iotAuthType) {
        this.iotAuthType = iotAuthType;
        return this;
    }
    public String getIotAuthType() {
        return this.iotAuthType;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setIotDataDigest(String iotDataDigest) {
        this.iotDataDigest = iotDataDigest;
        return this;
    }
    public String getIotDataDigest() {
        return this.iotDataDigest;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setIotIdServiceProvider(String iotIdServiceProvider) {
        this.iotIdServiceProvider = iotIdServiceProvider;
        return this;
    }
    public String getIotIdServiceProvider() {
        return this.iotIdServiceProvider;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setIotIdSource(String iotIdSource) {
        this.iotIdSource = iotIdSource;
        return this;
    }
    public String getIotIdSource() {
        return this.iotIdSource;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setIotSignature(String iotSignature) {
        this.iotSignature = iotSignature;
        return this;
    }
    public String getIotSignature() {
        return this.iotSignature;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setPhaseData(String phaseData) {
        this.phaseData = phaseData;
        return this;
    }
    public String getPhaseData() {
        return this.phaseData;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

    public UploadMPCoSPhaseTextInfoByDeviceRequest setRelatedDataList(java.util.Map<String, ?> relatedDataList) {
        this.relatedDataList = relatedDataList;
        return this;
    }
    public java.util.Map<String, ?> getRelatedDataList() {
        return this.relatedDataList;
    }

}
