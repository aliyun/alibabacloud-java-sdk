// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeletePictureRequest extends TeaModel {
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
     * <p>The IotId of the IPC device. The IotId is a unique identifier issued by IoT Platform for the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the IotId.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> is a unique identifier for the device and has a one-to-one mapping with the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1CJ0****e7qiq8VkQi1000000</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>If the instance has an ID, you must specify the ID. Otherwise, the call fails.</li>
     * <li>If the instance does not have an &lt;props=&quot;intl&quot;&gt;<ph><strong>Instance Overview</strong> page or an </ph>ID, you do not need to specify this parameter.</li>
     * </ul>
     * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-n6w1y******</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The list of picture IDs. Picture IDs are generated when you call the <a href="https://help.aliyun.com/document_detail/107914.html">TriggerCapturePicture</a> operation.</p>
     * <blockquote>
     * <p>You can specify up to 50 picture IDs in a single call.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cFc5MzZ<em><em><strong>npYT1</strong></em>TDFzX1hrVzA0Z</em>***</p>
     */
    @NameInMap("PictureIdList")
    public java.util.List<String> pictureIdList;

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

    public static DeletePictureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePictureRequest self = new DeletePictureRequest();
        return TeaModel.build(map, self);
    }

    public DeletePictureRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public DeletePictureRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public DeletePictureRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeletePictureRequest setPictureIdList(java.util.List<String> pictureIdList) {
        this.pictureIdList = pictureIdList;
        return this;
    }
    public java.util.List<String> getPictureIdList() {
        return this.pictureIdList;
    }

    public DeletePictureRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
