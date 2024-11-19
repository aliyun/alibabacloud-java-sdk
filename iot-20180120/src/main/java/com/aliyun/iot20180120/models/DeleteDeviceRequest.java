// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     * <blockquote>
     * <p>If you configure this parameter, you must specify a value for the <strong>ProductKey</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>light</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the device.</p>
     * <p><strong>Important</strong> The IotId parameter specifies a globally unique identifier (GUID) for the device. The value of the <strong>IotId</strong> parameter corresponds to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify a value for this parameter, you do not need to configure the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. If you specify values for the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>MpEKNuEUJzIORNANAWJX0010929900*****</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
     * <blockquote>
     * <p>If you configure this parameter, you must specify a value for the <strong>DeviceName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1FlqIQ****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static DeleteDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceRequest self = new DeleteDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public DeleteDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public DeleteDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
