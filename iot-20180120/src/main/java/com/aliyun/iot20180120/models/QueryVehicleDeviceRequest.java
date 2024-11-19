// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryVehicleDeviceRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     * 
     * <strong>example:</strong>
     * <p>light</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</li>
     * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-2w****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The <strong>ProductKey</strong> of the gateway product to which the device belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>a1Bw****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryVehicleDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVehicleDeviceRequest self = new QueryVehicleDeviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryVehicleDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryVehicleDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryVehicleDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
