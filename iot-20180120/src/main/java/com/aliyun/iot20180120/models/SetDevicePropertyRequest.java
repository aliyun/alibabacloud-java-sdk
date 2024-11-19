// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDevicePropertyRequest extends TeaModel {
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
     * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
     * <blockquote>
     * <p>The IotId parameter specifies a globally unique identifier (GUID) for the device. The value of the <strong>IotId</strong> parameter corresponds to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify a value for this parameter, you do not need to configure the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. If you specify values for the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Q7uOhVRdZRRlDnTLv****00100</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the elastic container instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</li>
     * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-v64*****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The properties that you want to specify. The properties must be in the JSON format.</p>
     * <p>Each property consists of a <strong>key-value pair in the key:value format</strong>. Separate multiple properties with commas (,).</p>
     * <p>For example, you can configure the following properties for a smart lamp:</p>
     * <ul>
     * <li>A switch property whose key is <strong>Switch</strong> and whose data type is <strong>BOOLEAN</strong>. The value is <strong>1</strong>. The value 1 indicates that the light is on.</li>
     * <li>A color property whose key is <strong>Color</strong> and whose data type is <strong>STRING</strong>. The value is <strong>blue</strong>.</li>
     * </ul>
     * <p>In this case, you can specify the following properties in the JSON format:</p>
     * <p><code>Items={&quot;Switch&quot;:1,&quot;Color&quot;:&quot;blue&quot;}</code></p>
     * <blockquote>
     * <p> If you specify properties for the custom module testFb, set the Items parameter to <code>{&quot;testFb:Switch&quot;:1,&quot;testFb:Color&quot;:&quot;blue&quot;}</code>. The testFb module is not the default module.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Switch&quot;:1,&quot;Color&quot;:&quot;blue&quot;}</p>
     */
    @NameInMap("Items")
    public String items;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <blockquote>
     * <p>If you configure this parameter, you must also specify a value for the <strong>DeviceName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Qos")
    public Integer qos;

    public static SetDevicePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDevicePropertyRequest self = new SetDevicePropertyRequest();
        return TeaModel.build(map, self);
    }

    public SetDevicePropertyRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public SetDevicePropertyRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SetDevicePropertyRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetDevicePropertyRequest setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

    public SetDevicePropertyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public SetDevicePropertyRequest setQos(Integer qos) {
        this.qos = qos;
        return this;
    }
    public Integer getQos() {
        return this.qos;
    }

}
