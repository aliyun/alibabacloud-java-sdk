// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AddShareTaskDeviceRequest extends TeaModel {
    @NameInMap("IotIdList")
    public java.util.List<String> iotIdList;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ShareTaskId")
    public String shareTaskId;

    public static AddShareTaskDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddShareTaskDeviceRequest self = new AddShareTaskDeviceRequest();
        return TeaModel.build(map, self);
    }

    public AddShareTaskDeviceRequest setIotIdList(java.util.List<String> iotIdList) {
        this.iotIdList = iotIdList;
        return this;
    }
    public java.util.List<String> getIotIdList() {
        return this.iotIdList;
    }

    public AddShareTaskDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public AddShareTaskDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public AddShareTaskDeviceRequest setShareTaskId(String shareTaskId) {
        this.shareTaskId = shareTaskId;
        return this;
    }
    public String getShareTaskId() {
        return this.shareTaskId;
    }

}
