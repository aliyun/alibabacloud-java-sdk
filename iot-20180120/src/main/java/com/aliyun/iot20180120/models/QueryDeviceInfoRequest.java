// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceInfoRequest extends TeaModel {
    /**
     * <p>The ID of the device.</p>
     * <br>
     * <p>> If you specify this parameter, you do not need to specify **ProductKey** or **DeviceName**. The **IotId** parameter specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of **ProductKey** and **DeviceName**. If you specify both **IotId** and the combination of **ProductKey** and **DeviceName**, **IotId** takes precedence.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <br>
     * <p>> If you specify this parameter, you must also specify the **DeviceName** parameter.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The DeviceName of the device.</p>
     * <br>
     * <p>> If you specify this parameter, you must also specify the **ProductKey** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceInfoRequest self = new QueryDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceInfoRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceInfoRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceInfoRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceInfoRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
