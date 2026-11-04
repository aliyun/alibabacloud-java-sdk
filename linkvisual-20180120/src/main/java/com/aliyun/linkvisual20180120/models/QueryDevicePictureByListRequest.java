// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureByListRequest extends TeaModel {
    /**
     * <p>The DeviceName of the IP camera.
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
     * <p>The expiration time of the image URL. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The ID of the IP camera. The ID is issued by IoT Platform and uniquely identifies the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the ID.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. <strong>IotId</strong> uniquely identifies the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1CJ0****e7qiq8VkQi1000000</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID.</p>
     * <p>&lt;props=&quot;china&quot;&gt;You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console. If the instance has an ID, you must specify the ID. Otherwise, the call fails.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>If the public instance does not have an ID, see <a href="https://help.aliyun.com/document_detail/267533.html">How to obtain an instance ID</a>.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-n6w1y******</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The list of image IDs. Image IDs are generated when you call the <a href="https://help.aliyun.com/document_detail/107914.html">TriggerCapturePicture</a> operation.</p>
     * <blockquote>
     * <p>You can specify up to 50 image IDs in a single call.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cFc5MzZ<em><em><strong>npYT1</strong></em>TDFzX1hrVzA0Z</em>***</p>
     */
    @NameInMap("PictureIdList")
    public java.util.List<String> pictureIdList;

    /**
     * <p>The image type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: thumbnail.</li>
     * <li><strong>1</strong>: original image. </li>
     * <li><strong>2</strong>: all. Default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PictureType")
    public Integer pictureType;

    /**
     * <p>The ProductKey of the product to which the IP camera belongs.
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
     * <p>Specifies the width of the target thumbnail. Unit: px. Valid values: 1 to 4096.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ThumbWidth")
    public Integer thumbWidth;

    public static QueryDevicePictureByListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureByListRequest self = new QueryDevicePictureByListRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureByListRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDevicePictureByListRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public QueryDevicePictureByListRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDevicePictureByListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDevicePictureByListRequest setPictureIdList(java.util.List<String> pictureIdList) {
        this.pictureIdList = pictureIdList;
        return this;
    }
    public java.util.List<String> getPictureIdList() {
        return this.pictureIdList;
    }

    public QueryDevicePictureByListRequest setPictureType(Integer pictureType) {
        this.pictureType = pictureType;
        return this;
    }
    public Integer getPictureType() {
        return this.pictureType;
    }

    public QueryDevicePictureByListRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDevicePictureByListRequest setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
        return this;
    }
    public Integer getThumbWidth() {
        return this.thumbWidth;
    }

}
