// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventRecordRequest extends TeaModel {
    /**
     * <p>The DeviceName of the IP camera (IPC) device.
     * You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page of the IoT Platform console.</p>
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
     * <p>The ID of the intelligent alert event. You can call the <a href="https://help.aliyun.com/document_detail/107916.html">QueryDeviceEvent</a> operation to obtain the event ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>907084996e1d44788d0<em><strong><strong>43906_160803</strong></strong></em>37</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The IotId of the IP camera (IPC) device. The IotId is the globally unique identifier of the device that is issued by IoT Platform. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the IotId.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> is the globally unique identifier of the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zLZyi6aOLyOSHa9hsPyD00****</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance.</p>
     * <p>&lt;props=&quot;china&quot;&gt;You can view the <strong>ID</strong> of the instance on the <strong>Instance Overview</strong> page of the IoT Platform console. If your instance has an ID, you must specify the ID. Otherwise, the call fails.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>If your public instance does not have an ID, see <a href="https://help.aliyun.com/document_detail/267533.html">How to obtain an instance ID</a>.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-n6w1****z0t</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the IP camera (IPC) device belongs.
     * You can view the ProductKey on the <strong>Products</strong> page of the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information of all products under the current account.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static QueryDeviceEventRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventRecordRequest self = new QueryDeviceEventRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventRecordRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceEventRecordRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryDeviceEventRecordRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceEventRecordRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceEventRecordRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
