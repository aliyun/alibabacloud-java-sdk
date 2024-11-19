// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDetailRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     * <blockquote>
     * <p> If you specify a value for this parameter, you must also specify a value for the <strong>ProductKey</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>light</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the device.</p>
     * <blockquote>
     * <p> If you specify a value for this parameter, you do not need to specify a value for the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) for the device. The value of the IotId parameter corresponds to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify a value for the <strong>IotId</strong> parameter and values for the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Q7uOhVRdZRRlDnTLv****00100</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-v64***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <blockquote>
     * <p> If you specify a value for this parameter, you must also specify a value for the <strong>DeviceName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryDeviceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDetailRequest self = new QueryDeviceDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDetailRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceDetailRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceDetailRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceDetailRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
