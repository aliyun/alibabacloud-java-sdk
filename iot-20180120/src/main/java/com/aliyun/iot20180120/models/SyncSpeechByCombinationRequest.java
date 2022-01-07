// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SyncSpeechByCombinationRequest extends TeaModel {
    @NameInMap("CombinationList")
    public java.util.List<String> combinationList;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

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

    public SyncSpeechByCombinationRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public SyncSpeechByCombinationRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SyncSpeechByCombinationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SyncSpeechByCombinationRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
