// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SpeechByCombinationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>wav</p>
     */
    @NameInMap("AudioFormat")
    public String audioFormat;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZFBDZ</p>
     */
    @NameInMap("CombinationList")
    public java.util.List<String> combinationList;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnforceFlag")
    public Boolean enforceFlag;

    /**
     * <strong>example:</strong>
     * <p>Q7uOhVRdZRRlDnTLv****00100</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <strong>example:</strong>
     * <p>42000011392021112380********</p>
     */
    @NameInMap("SpeechId")
    public String speechId;

    public static SpeechByCombinationRequest build(java.util.Map<String, ?> map) throws Exception {
        SpeechByCombinationRequest self = new SpeechByCombinationRequest();
        return TeaModel.build(map, self);
    }

    public SpeechByCombinationRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public SpeechByCombinationRequest setCombinationList(java.util.List<String> combinationList) {
        this.combinationList = combinationList;
        return this;
    }
    public java.util.List<String> getCombinationList() {
        return this.combinationList;
    }

    public SpeechByCombinationRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public SpeechByCombinationRequest setEnforceFlag(Boolean enforceFlag) {
        this.enforceFlag = enforceFlag;
        return this;
    }
    public Boolean getEnforceFlag() {
        return this.enforceFlag;
    }

    public SpeechByCombinationRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SpeechByCombinationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SpeechByCombinationRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public SpeechByCombinationRequest setSpeechId(String speechId) {
        this.speechId = speechId;
        return this;
    }
    public String getSpeechId() {
        return this.speechId;
    }

}
