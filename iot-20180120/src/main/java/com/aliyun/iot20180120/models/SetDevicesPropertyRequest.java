// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDevicesPropertyRequest extends TeaModel {
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

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
     * <p>The properties that you want to specify. The properties must be in the JSON format.</p>
     * <br>
     * <p>Each property consists of a **key-value pair in the key:value format**. Separate multiple properties with commas (,).</p>
     * <br>
     * <p>For example, you can configure the following properties for a smart lamp:</p>
     * <br>
     * <p>*   A switch property whose key is **Switch** and whose data type is **BOOLEAN**. The value is **1**. The value 1 indicates that the light is on.</p>
     * <p>*   A color property whose key is **Color** and whose data type is **STRING**. The value is **blue**.</p>
     * <br>
     * <p>In this case, you can specify the following properties in the JSON format:</p>
     * <br>
     * <p>`Items={"Switch":1,"Color":"blue"}`</p>
     * <br>
     * <p>>  If you configure properties for the custom module testFb, set the Items parameter to `{"testFb:Switch":1,"testFb:Color":"blue"}`. The testFb module is not the default module.</p>
     */
    @NameInMap("Items")
    public String items;

    /**
     * <p>The **ProductKey** of the product to which the device belongs.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Qos")
    public Integer qos;

    public static SetDevicesPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDevicesPropertyRequest self = new SetDevicesPropertyRequest();
        return TeaModel.build(map, self);
    }

    public SetDevicesPropertyRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public SetDevicesPropertyRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetDevicesPropertyRequest setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

    public SetDevicesPropertyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public SetDevicesPropertyRequest setQos(Integer qos) {
        this.qos = qos;
        return this;
    }
    public Integer getQos() {
        return this.qos;
    }

}
