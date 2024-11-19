// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class WriteDevicesHotStorageDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>device1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <strong>example:</strong>
     * <p>y4u2weAI********HMle1234</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-2w****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;Power&quot;: { &quot;value&quot;: &quot;on&quot;, &quot;time&quot;: 1524448722000 }, &quot;WF&quot;: { &quot;value&quot;: 23.6, &quot;time&quot;: 1524448722000 } }</p>
     */
    @NameInMap("Items")
    public String items;

    /**
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>This parameter is required.</p>
     */
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
