// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SaveDevicePropRequest extends TeaModel {
    /**
     * <p>The DeviceName of the device.</p>
     * <blockquote>
     * <p> If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
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
     * <p> If you specify this parameter, you do not need to specify the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameters. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) for the device. The value of the IotId parameter corresponds to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Q7uOhVRdZRRlDnTLv****00100</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. On the <strong>Overview</strong> page in the IoT Platform console, you can view the <strong>ID</strong> of the instance.</p>
     * <p><strong>Important</strong></p>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If the <strong>Overview</strong> page or instance ID is not displayed in the IoT Platform console, you do not need to configure this parameter.</li>
     * </ul>
     * <p>For more information about the instance, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <blockquote>
     * <p> If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The tag that you want to specify for the device. You can specify multiple tags.</p>
     * <p>The tags must be JSON data in the <strong>Key:Value</strong> format. <strong>Key</strong> indicates the tag name, and <strong>Value</strong> indicates the tag value.</p>
     * <p>Separate multiple tags with commas (,). Example: <strong>Props={&quot;color&quot;:&quot;red&quot;,&quot;shape&quot;:&quot;round&quot;}</strong></p>
     * <p><strong>Important</strong></p>
     * <ul>
     * <li>The maximum size of the <strong>Props</strong> parameter is 5 KB.</li>
     * <li><code>abc</code> is a <strong>key</strong> that is reserved by IoT Platform. You cannot set <strong>Key</strong> to abc. If you set <code>Key</code> to abc, the abc tag is automatically filtered when you query tags.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;color&quot;:&quot;red&quot;}</p>
     */
    @NameInMap("Props")
    public String props;

    public static SaveDevicePropRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveDevicePropRequest self = new SaveDevicePropRequest();
        return TeaModel.build(map, self);
    }

    public SaveDevicePropRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public SaveDevicePropRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SaveDevicePropRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SaveDevicePropRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public SaveDevicePropRequest setProps(String props) {
        this.props = props;
        return this;
    }
    public String getProps() {
        return this.props;
    }

}
