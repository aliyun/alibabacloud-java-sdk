// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ClearDeviceDesiredPropertyRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     * <br>
     * <p>>  If you specify a value for this parameter, you must configure the **ProductKey** parameter.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("Identifies")
    public java.util.List<String> identifies;

    /**
     * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
     * <br>
     * <p>>  The IotId parameter specifies a globally unique identifier (GUID) for the device. The value of the **IotId** parameter is equivalent to a combination of the values of the **ProductKey** and **DeviceName** parameters. If you specify a value for the IotId parameter, you do not need to configure the **ProductKey** or **DeviceName** parameter. If you specify values for the **IotId**, **ProductKey**, and **DeviceName** parameters, the value of the **IotId** parameter takes precedence.</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. You can view the ID of the instance on the **Overview** page in the IoT Platform console.****</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</p>
     * <p>>*   If no **Overview** page or **ID** is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The **ProductKey** of the product to which the device belongs.</p>
     * <br>
     * <p>>  If you specify a value for this parameter, you must configure the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static ClearDeviceDesiredPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearDeviceDesiredPropertyRequest self = new ClearDeviceDesiredPropertyRequest();
        return TeaModel.build(map, self);
    }

    public ClearDeviceDesiredPropertyRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ClearDeviceDesiredPropertyRequest setIdentifies(java.util.List<String> identifies) {
        this.identifies = identifies;
        return this;
    }
    public java.util.List<String> getIdentifies() {
        return this.identifies;
    }

    public ClearDeviceDesiredPropertyRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public ClearDeviceDesiredPropertyRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ClearDeviceDesiredPropertyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
