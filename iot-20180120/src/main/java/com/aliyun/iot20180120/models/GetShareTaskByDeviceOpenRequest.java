// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetShareTaskByDeviceOpenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>device1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <strong>example:</strong>
     * <p>y4u2weAIrpp****WHMle1234</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <strong>example:</strong>
     * <p>iot-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <strong>example:</strong>
     * <p>a2Yw*****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static GetShareTaskByDeviceOpenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShareTaskByDeviceOpenRequest self = new GetShareTaskByDeviceOpenRequest();
        return TeaModel.build(map, self);
    }

    public GetShareTaskByDeviceOpenRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public GetShareTaskByDeviceOpenRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public GetShareTaskByDeviceOpenRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetShareTaskByDeviceOpenRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
