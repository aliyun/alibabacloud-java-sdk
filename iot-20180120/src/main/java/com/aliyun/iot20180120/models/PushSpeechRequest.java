// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PushSpeechRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <strong>example:</strong>
     * <p>4de2c367**<strong>8c585e5992</strong></p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>4de2c367**<strong>8c585e5992</strong></p>
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
     * <p>light</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4de2c367**<strong>8c585e5992</strong></p>
     */
    @NameInMap("ProjectCode")
    public String projectCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SINGLE_DEVICE</p>
     */
    @NameInMap("PushMode")
    public String pushMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4de2c367**<strong>8c585e5992</strong></p>
     */
    @NameInMap("SpeechCodeList")
    public java.util.List<String> speechCodeList;

    public static PushSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        PushSpeechRequest self = new PushSpeechRequest();
        return TeaModel.build(map, self);
    }

    public PushSpeechRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public PushSpeechRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PushSpeechRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public PushSpeechRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public PushSpeechRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public PushSpeechRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public PushSpeechRequest setPushMode(String pushMode) {
        this.pushMode = pushMode;
        return this;
    }
    public String getPushMode() {
        return this.pushMode;
    }

    public PushSpeechRequest setSpeechCodeList(java.util.List<String> speechCodeList) {
        this.speechCodeList = speechCodeList;
        return this;
    }
    public java.util.List<String> getSpeechCodeList() {
        return this.speechCodeList;
    }

}
