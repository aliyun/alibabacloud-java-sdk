// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class TransferDeviceInstanceRequest extends TeaModel {
    @NameInMap("DeviceNameList")
    public java.util.List<String> deviceNameList;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    public static TransferDeviceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferDeviceInstanceRequest self = new TransferDeviceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TransferDeviceInstanceRequest setDeviceNameList(java.util.List<String> deviceNameList) {
        this.deviceNameList = deviceNameList;
        return this;
    }
    public java.util.List<String> getDeviceNameList() {
        return this.deviceNameList;
    }

    public TransferDeviceInstanceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public TransferDeviceInstanceRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public TransferDeviceInstanceRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

}
