// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureFileRequest extends TeaModel {
    /**
     * <p>The ID of the image generated when a snapshot capture event occurs:</p>
     * <ul>
     * <li>For active snapshot capture, see <a href="https://help.aliyun.com/document_detail/107914.html">TriggerCapturePicture</a> for the image ID.</li>
     * <li>For snapshot capture triggered by an intelligent alert event, see <a href="https://help.aliyun.com/document_detail/107916.html">QueryDeviceEvent</a> for the image ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fdc576d03c094faea9fa10fbf48c****</p>
     */
    @NameInMap("CaptureId")
    public String captureId;

    /**
     * <p>The DeviceName of the IPC device.
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
     * <p>Specifies the expiration time of the image URL. Unit: minutes. Valid values: 1 to 43200.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The IotId of the IPC device. The IotId is the globally unique identifier (GUID) that is issued by IoT Platform to the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the IotId.</p>
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
     * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>If the instance has an ID, you must specify the ID. Otherwise, the call fails.</li>
     * <li>If the &lt;props=&quot;intl&quot;&gt;<ph><strong>Overview</strong> page is not displayed or the instance does not have an </ph>ID, you do not need to specify this parameter.</li>
     * </ul>
     * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-n6w1y******</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The image type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: thumbnail.</li>
     * <li><strong>1</strong>: original image.</li>
     * <li><strong>2</strong>: all images. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PictureType")
    public Integer pictureType;

    /**
     * <p>The ProductKey of the product to which the IPC device belongs.
     * You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information about all products under the current account.</p>
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
     * <p>Specifies the width of the target scaled image. Unit: px. Valid values: 1 to 4096.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ThumbWidth")
    public Integer thumbWidth;

    public static QueryDevicePictureFileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureFileRequest self = new QueryDevicePictureFileRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureFileRequest setCaptureId(String captureId) {
        this.captureId = captureId;
        return this;
    }
    public String getCaptureId() {
        return this.captureId;
    }

    public QueryDevicePictureFileRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDevicePictureFileRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public QueryDevicePictureFileRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDevicePictureFileRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDevicePictureFileRequest setPictureType(Integer pictureType) {
        this.pictureType = pictureType;
        return this;
    }
    public Integer getPictureType() {
        return this.pictureType;
    }

    public QueryDevicePictureFileRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDevicePictureFileRequest setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
        return this;
    }
    public Integer getThumbWidth() {
        return this.thumbWidth;
    }

}
