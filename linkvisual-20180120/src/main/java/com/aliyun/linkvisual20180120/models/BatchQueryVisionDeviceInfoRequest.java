// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class BatchQueryVisionDeviceInfoRequest extends TeaModel {
    @NameInMap("DeviceNameList")
    public java.util.List<String> deviceNameList;

    @NameInMap("IotIdList")
    public java.util.List<String> iotIdList;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    public static BatchQueryVisionDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryVisionDeviceInfoRequest self = new BatchQueryVisionDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryVisionDeviceInfoRequest setDeviceNameList(java.util.List<String> deviceNameList) {
        this.deviceNameList = deviceNameList;
        return this;
    }
    public java.util.List<String> getDeviceNameList() {
        return this.deviceNameList;
    }

    public BatchQueryVisionDeviceInfoRequest setIotIdList(java.util.List<String> iotIdList) {
        this.iotIdList = iotIdList;
        return this;
    }
    public java.util.List<String> getIotIdList() {
        return this.iotIdList;
    }

    public BatchQueryVisionDeviceInfoRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchQueryVisionDeviceInfoRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
