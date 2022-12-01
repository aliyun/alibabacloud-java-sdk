// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class WriteDevicesHotStorageDataRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Items")
    public String items;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("UserTopic")
    public String userTopic;

    public static WriteDevicesHotStorageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        WriteDevicesHotStorageDataRequest self = new WriteDevicesHotStorageDataRequest();
        return TeaModel.build(map, self);
    }

    public WriteDevicesHotStorageDataRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public WriteDevicesHotStorageDataRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public WriteDevicesHotStorageDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public WriteDevicesHotStorageDataRequest setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

    public WriteDevicesHotStorageDataRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public WriteDevicesHotStorageDataRequest setUserTopic(String userTopic) {
        this.userTopic = userTopic;
        return this;
    }
    public String getUserTopic() {
        return this.userTopic;
    }

}
