// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SaveDevicePropRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     * <br>
     * <p>>  If you specify this parameter, you must also specify the **ProductKey** parameter.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
     * <br>
     * <p>>  If you specify this parameter, you do not need to specify the **ProductKey** or **DeviceName** parameters. The **IotId** parameter specifies a globally unique identifier (GUID) for the device. The value of the IotId parameter corresponds to a combination of the values of the **ProductKey** and **DeviceName** parameters. If you specify the **IotId**, **ProductKey**, and **DeviceName** parameters, the value of the **IotId** parameter takes precedence.</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. On the **Overview** page in the IoT Platform console, you can view the **ID** of the instance.</p>
     * <br>
     * <br>
     * <p>**Important**</p>
     * <br>
     * <p>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>*   If the **Overview** page or instance ID is not displayed in the IoT Platform console, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information about the instance, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <br>
     * <p>>  If you specify this parameter, you must also specify the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The tag that you want to specify for the device. You can specify multiple tags.</p>
     * <br>
     * <p>The tags must be JSON data in the **Key:Value** format. **Key** indicates the tag name, and **Value** indicates the tag value.</p>
     * <br>
     * <p>Separate multiple tags with commas (,). Example: **Props={"color":"red","shape":"round"}**</p>
     * <br>
     * <br>
     * <p>**Important**</p>
     * <br>
     * <p>*   The maximum size of the **Props** parameter is 5 KB.</p>
     * <p>*   `abc` is a **key** that is reserved by IoT Platform. You cannot set **Key** to abc. If you set `Key` to abc, the abc tag is automatically filtered when you query tags.</p>
     */
    @NameInMap("Props")
    public String props;

    public static SaveDevicePropRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveDevicePropRequest self = new SaveDevicePropRequest();
        return TeaModel.build(map, self);
    }

    public SaveDevicePropRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public SaveDevicePropRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SaveDevicePropRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SaveDevicePropRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public SaveDevicePropRequest setProps(String props) {
        this.props = props;
        return this;
    }
    public String getProps() {
        return this.props;
    }

}
