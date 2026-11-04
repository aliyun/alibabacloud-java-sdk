// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordUrlByTimeRequest extends TeaModel {
    /**
     * <p>The start time of the query range. The value is a 10-digit timestamp in seconds.</p>
     * <p>The minimum value is 0, and the maximum value is 2147483647.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1638675381</p>
     */
    @NameInMap("BeginTime")
    public Integer beginTime;

    /**
     * <p>The DeviceName of the IP camera.
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
     * <p>The end time of the query range. The value is a 10-digit timestamp in seconds.</p>
     * <p>The minimum value is 0, and the maximum value is 2147483647.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1638866820</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The IotId of the IP camera. The IotId is the unique identifier issued by IoT Platform for the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the IotId.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> is the unique identifier of the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d7XmBoJhAr88C6PelXDF00****</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID.</p>
     * <p>You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page of the IoT Platform console. If the instance has an ID, you must specify this ID. Otherwise, the call fails.</p>
     * <blockquote>
     * <p>If the public instance does not have an ID, see <a href="https://help.aliyun.com/document_detail/267533.html">How to obtain an instance ID</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>iot-060a****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the IP camera belongs.
     * You can view the ProductKey on the <strong>Products</strong> page of the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query all products under the current account.</p>
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
     * <p>The type of the video stream. Valid values:</p>
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

    /**
     * <p>The validity period of the URL. Valid values: 10 to 3600. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("UrlValidDuration")
    public Integer urlValidDuration;

    public static QueryRecordUrlByTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordUrlByTimeRequest self = new QueryRecordUrlByTimeRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordUrlByTimeRequest setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Integer getBeginTime() {
        return this.beginTime;
    }

    public QueryRecordUrlByTimeRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryRecordUrlByTimeRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public QueryRecordUrlByTimeRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryRecordUrlByTimeRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryRecordUrlByTimeRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryRecordUrlByTimeRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

    public QueryRecordUrlByTimeRequest setUrlValidDuration(Integer urlValidDuration) {
        this.urlValidDuration = urlValidDuration;
        return this;
    }
    public Integer getUrlValidDuration() {
        return this.urlValidDuration;
    }

}
