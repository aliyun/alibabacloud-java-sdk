// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class NotifyAddThingTopoRequest extends TeaModel {
    /**
     * <p>A JSON array of the sub-device identity information. You can use a combination of **ProductKey** and **DeviceName** or only **IotId** to specify a device, such as **\[{"productKey":"a1BwAGxxx","deviceName":"device1"},{"IotId":"Q7uOhxxx"}]**.</p>
     */
    @NameInMap("DeviceListStr")
    public String deviceListStr;

    /**
     * <p>The DeviceName of the gateway.</p>
     * <br>
     * <p>>  If you specify this parameter, you must also specify the **ProductKey** parameter.</p>
     */
    @NameInMap("GwDeviceName")
    public String gwDeviceName;

    /**
     * <p>The ID of the gateway device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
     * <br>
     * <p>>  If you specify this parameter, you do not need to specify **ProductKey** or **DeviceName**. The **IotId** parameter specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of **ProductKey** and **DeviceName**. If you specify both **IotId** and the combination of **ProductKey** and **DeviceName**, **IotId** takes precedence.</p>
     */
    @NameInMap("GwIotId")
    public String gwIotId;

    /**
     * <p>The ProductKey of the product to which the gateway belongs.</p>
     * <br>
     * <p>>  If you specify this parameter, you must also specify the **DeviceName** parameter.</p>
     */
    @NameInMap("GwProductKey")
    public String gwProductKey;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static NotifyAddThingTopoRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyAddThingTopoRequest self = new NotifyAddThingTopoRequest();
        return TeaModel.build(map, self);
    }

    public NotifyAddThingTopoRequest setDeviceListStr(String deviceListStr) {
        this.deviceListStr = deviceListStr;
        return this;
    }
    public String getDeviceListStr() {
        return this.deviceListStr;
    }

    public NotifyAddThingTopoRequest setGwDeviceName(String gwDeviceName) {
        this.gwDeviceName = gwDeviceName;
        return this;
    }
    public String getGwDeviceName() {
        return this.gwDeviceName;
    }

    public NotifyAddThingTopoRequest setGwIotId(String gwIotId) {
        this.gwIotId = gwIotId;
        return this;
    }
    public String getGwIotId() {
        return this.gwIotId;
    }

    public NotifyAddThingTopoRequest setGwProductKey(String gwProductKey) {
        this.gwProductKey = gwProductKey;
        return this;
    }
    public String getGwProductKey() {
        return this.gwProductKey;
    }

    public NotifyAddThingTopoRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
