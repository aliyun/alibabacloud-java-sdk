// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindGatewayToEdgeInstanceRequest extends TeaModel {
    /**
     * <p>The name of the gateway.</p>
     * <blockquote>
     * <p> If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>device1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Edge Instances</strong> page, move the pointer over the name of the edge instance to which you want to bind a gateway and obtain the instance ID.</p>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/135214.html">QueryEdgeInstance</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>F3APY0tPLhmgGtx0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the gateway in IoT Platform. This parameter corresponds to the combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters.</p>
     * <blockquote>
     * <p> If you specify this parameter, you do not need to specify the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. If you use the <strong>IotId</strong> parameter and the combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters, only the <strong>IotId</strong> parameter takes effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4z819VQHk6VSLmmBJfrf0010******</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The key that uniquely identifies the product to which the gateway belongs.</p>
     * <blockquote>
     * <p> If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1mAdeG****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static BindGatewayToEdgeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindGatewayToEdgeInstanceRequest self = new BindGatewayToEdgeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BindGatewayToEdgeInstanceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public BindGatewayToEdgeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BindGatewayToEdgeInstanceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public BindGatewayToEdgeInstanceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BindGatewayToEdgeInstanceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
