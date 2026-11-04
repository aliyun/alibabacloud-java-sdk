// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class StopTriggeredRecordRequest extends TeaModel {
    /**
     * <p>The DeviceName of the IP camera. You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.</p>
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
     * <p>The device ID of the IP camera. The ID is issued by IoT Platform and uniquely identifies the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the device ID.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> uniquely identifies the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.
     * The device ID of the IP camera. The ID is issued by IoT Platform and uniquely identifies the device.</p>
     * </blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the device ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C47T6xwp6ms4bNlkHRWCg4****</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console. If the instance has an ID, you must specify this ID. Otherwise, the call fails.</p>
     * <blockquote>
     * <p>If the public instance does not have an ID, see <a href="https://help.aliyun.com/document_detail/267533.html">How to obtain an instance ID</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-n6w1y59****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the IP camera belongs. You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information about all products under the current account.</p>
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
     * <p>The recording ID. You can call the <a href="https://help.aliyun.com/document_detail/107915.html">TriggerRecord</a> operation to query the recording ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fc82774fa749485bad7d719f9670****</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    public static StopTriggeredRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTriggeredRecordRequest self = new StopTriggeredRecordRequest();
        return TeaModel.build(map, self);
    }

    public StopTriggeredRecordRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public StopTriggeredRecordRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public StopTriggeredRecordRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public StopTriggeredRecordRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public StopTriggeredRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
