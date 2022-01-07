// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PushSpeechRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ProjectCode")
    public String projectCode;

    @NameInMap("PushMode")
    public String pushMode;

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
