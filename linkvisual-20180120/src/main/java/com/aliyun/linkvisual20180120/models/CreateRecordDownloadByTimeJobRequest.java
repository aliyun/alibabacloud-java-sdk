// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateRecordDownloadByTimeJobRequest extends TeaModel {
    /**
     * <p>The start time. The value must be a 10-digit UNIX timestamp in seconds. Valid values: 0 to 2147483647.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1900000000</p>
     */
    @NameInMap("BeginTime")
    public Integer beginTime;

    /**
     * <p>The DeviceName of the video device. You can view the <strong>DeviceName</strong> of devices under a specified product on the <strong>Devices</strong> page in the <a href="https://iot.console.aliyun.com/devices">IoT Platform console</a> or by calling the <a href="https://help.aliyun.com/document_detail/69905.html">QueryDevice</a> operation.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Device01</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The end time. The value must be a 10-digit UNIX timestamp in seconds. Valid values: 0 to 2147483647. The value must be greater than the start time specified by <strong>BeginTime</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2100000000</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The ID of the video device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation to query the ID.</p>
     * <blockquote>
     * <p>Notice:  <strong>IotId</strong> is the unique identifier of the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>C47T6xwp6ms4bNlkHRWCg4****</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID. You can view the ID of the current instance on the <strong>Instance Overview</strong> tab in the IoT Platform console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-******</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the video device belongs.</p>
     * <p>You can view the information about all products under the current instance on the <strong>Products</strong> page in the <a href="https://iot.console.aliyun.com/product">IoT Platform console</a> or by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1Bw******</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The recording type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: continuous recording.</li>
     * <li><strong>1</strong>: event recording.</li>
     * <li><strong>2</strong>: on-demand recording.</li>
     * <li><strong>4</strong>: local-to-cloud recording.</li>
     * <li><strong>Empty</strong>: all recordings.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RecordType")
    public Integer recordType;

    /**
     * <p>The stream type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): main stream.</li>
     * <li><strong>1</strong>: sub stream.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StreamType")
    public Integer streamType;

    public static CreateRecordDownloadByTimeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordDownloadByTimeJobRequest self = new CreateRecordDownloadByTimeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecordDownloadByTimeJobRequest setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Integer getBeginTime() {
        return this.beginTime;
    }

    public CreateRecordDownloadByTimeJobRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateRecordDownloadByTimeJobRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public CreateRecordDownloadByTimeJobRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public CreateRecordDownloadByTimeJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateRecordDownloadByTimeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateRecordDownloadByTimeJobRequest setRecordType(Integer recordType) {
        this.recordType = recordType;
        return this;
    }
    public Integer getRecordType() {
        return this.recordType;
    }

    public CreateRecordDownloadByTimeJobRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
