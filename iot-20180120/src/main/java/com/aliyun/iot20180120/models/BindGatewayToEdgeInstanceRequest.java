// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindGatewayToEdgeInstanceRequest extends TeaModel {
    /**
     * <p>The name of the gateway.</p>
     * <br>
     * <p>>  If you specify this parameter, you must also specify the **ProductKey** parameter.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the [Link IoT Edge console](https://iot.console.aliyun.com/le/instance/list). On the **Edge Instances** page, move the pointer over the name of the edge instance to which you want to bind a gateway and obtain the instance ID.</p>
     * <br>
     * <p>You can also call the [QueryEdgeInstance](~~135214~~) operation to query the instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the gateway in IoT Platform. This parameter corresponds to the combination of the **ProductKey** and **DeviceName** parameters.</p>
     * <br>
     * <p>>  If you specify this parameter, you do not need to specify the **ProductKey** or **DeviceName** parameter. If you use the **IotId** parameter and the combination of the **ProductKey** and **DeviceName** parameters, only the **IotId** parameter takes effect.</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The key that uniquely identifies the product to which the gateway belongs.</p>
     * <br>
     * <p>>  If you specify this parameter, you must also specify the **DeviceName** parameter.</p>
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
