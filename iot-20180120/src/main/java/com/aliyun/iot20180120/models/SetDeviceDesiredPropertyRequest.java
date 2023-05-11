// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDeviceDesiredPropertyRequest extends TeaModel {
    /**
     * <p>The name of the device.</p>
     * <br>
     * <p>> If you specify a value for this parameter, you must also specify a value for the **ProductKey** parameter.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
     * <br>
     * <p>> The IotId parameter specifies a globally unique identifier (GUID) for the device. The value of the **IotId** parameter corresponds to a combination of the values of the **ProductKey** and **DeviceName** parameters. If you specify a value for this parameter, you do not need to specify the **ProductKey** or **DeviceName** parameters. If you specify values for the **IotId**, **ProductKey**, and **DeviceName** parameters, the value of the **IotId** parameter takes precedence.</p>
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
     * <p>The property value that you want to specify. The value of this parameter is a JSON string. Format: **Key:Value**. Example: {"Temperature":35}. You can specify up to 10 desired property values.</p>
     * <br>
     * <p>*   **Key** specifies the identifier of the property. You can view the property identifier on the **Define Feature**[ tab of the Product Details page in the IoT Platform console. You can also call the ](~~150321~~)QueryThingModel operation and view the property identifier in the returned TSL data.</p>
     * <br>
     * <p>    If the temperature property belongs to a custom module named testFb, this parameter is set to **{"testFb:temperature":35}**.</p>
     * <br>
     * <p>>The specified property must allow read/write access. If you specify a read-only property, the setting fails. The property identifier must be unique.</p>
     * <br>
     * <p>*   **Value** specifies the desired value of the property. The value must match the data type and value range that are defined for the property.</p>
     * <br>
     * <p>> If you set Value to null, the desired value of the property is cleared.</p>
     */
    @NameInMap("Items")
    public String items;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <br>
     * <p>> If you configure this parameter, you must also specify a value for the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The version number of the desired property value. The value of this parameter is a JSON string. Format: Key:Value. Example: {"Temperature":2}.</p>
     * <br>
     * <p>*   **Key** specifies the identifier of the property. You can view the property identifier on the Define Feature tab of the Product Details page in the IoT Platform console.</p>
     * <br>
     * <p>> The property identifier must be unique.</p>
     * <br>
     * <p>*   **Value** specifies the version number of the desired property value.</p>
     * <br>
     * <p>    The first time you specify a desired property value, set the Value parameter to 0. After you set the property value, the version number changes to 1. Each time you specify a desired property value, IoT Platform automatically increases the version number by 1. The second time that you specify a desired property value, the version number changes to 2. The third time that you specify a desired property value, set the version number to 2. After you specify the desired property value, the version number changes to 3.</p>
     * <br>
     * <p>> If the version number that you specify for this parameter is not the current version number, the server rejects the request. If you are not sure about the current version number, you do not need to specify a version number. However, you must enter a valid JSON object {}.</p>
     */
    @NameInMap("Versions")
    public String versions;

    public static SetDeviceDesiredPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceDesiredPropertyRequest self = new SetDeviceDesiredPropertyRequest();
        return TeaModel.build(map, self);
    }

    public SetDeviceDesiredPropertyRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public SetDeviceDesiredPropertyRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SetDeviceDesiredPropertyRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetDeviceDesiredPropertyRequest setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

    public SetDeviceDesiredPropertyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public SetDeviceDesiredPropertyRequest setVersions(String versions) {
        this.versions = versions;
        return this;
    }
    public String getVersions() {
        return this.versions;
    }

}
