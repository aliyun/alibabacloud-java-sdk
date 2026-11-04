// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDeviceByDeviceRequest extends TeaModel {
    /**
     * <p>The device name of the IPC device.
     * You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>camera1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The device ID of the IPC device. This is the unique identifier issued by IoT Platform for the device. You can call <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> of IoT Platform to query the device ID.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. <strong>IotId</strong> is a globally unique identifier of the device and corresponds to a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong> on a one-to-one basis. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zLZyi6aOLyOSHa9hsPyD00****</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID.</p>
     * <p>You can view the <strong>ID</strong> of the current instance on the <strong>Overview</strong> page in the IoT Platform console. If the ID value exists, you must specify this ID value. Otherwise, the call fails.</p>
     * <blockquote>
     * <p>If the public instance does not have an ID value, see <a href="https://help.aliyun.com/document_detail/267533.html">How to obtain an instance ID</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-n6w1y59****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the IPC device belongs.
     * You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console, or call <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> to query the information about all products under the current account.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The stream type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): main stream</li>
     * <li><strong>1</strong>: sub stream</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StreamType")
    public Integer streamType;

    public static QueryEventRecordPlanDeviceByDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlanDeviceByDeviceRequest self = new QueryEventRecordPlanDeviceByDeviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlanDeviceByDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryEventRecordPlanDeviceByDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryEventRecordPlanDeviceByDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryEventRecordPlanDeviceByDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryEventRecordPlanDeviceByDeviceRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
