// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SyncSpeechByCombinationRequest extends TeaModel {
    @NameInMap("CombinationList")
    @Validation(required = true)
    public java.util.List<String> combinationList;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("AudioFormat")
    public String audioFormat;

    @NameInMap("SpeechId")
    public String speechId;

    public static SyncSpeechByCombinationRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncSpeechByCombinationRequest self = new SyncSpeechByCombinationRequest();
        return TeaModel.build(map, self);
    }

    public SyncSpeechByCombinationRequest setCombinationList(java.util.List<String> combinationList) {
        this.combinationList = combinationList;
        return this;
    }
    public java.util.List<String> getCombinationList() {
        return this.combinationList;
    }

    public SyncSpeechByCombinationRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SyncSpeechByCombinationRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public SyncSpeechByCombinationRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public SyncSpeechByCombinationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SyncSpeechByCombinationRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public SyncSpeechByCombinationRequest setSpeechId(String speechId) {
        this.speechId = speechId;
        return this;
    }
    public String getSpeechId() {
        return this.speechId;
    }

}
