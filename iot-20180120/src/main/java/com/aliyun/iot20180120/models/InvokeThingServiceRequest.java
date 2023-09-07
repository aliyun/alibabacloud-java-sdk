// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeThingServiceRequest extends TeaModel {
    /**
     * <p>The input parameter of the service. The value is a JSON string. Example: **Args={"param1": 1}**.</p>
     * <br>
     * <p>If this parameter is left empty, set the value to **Args={}**.</p>
     * <br>
     * <p>> If the TSL data is of the float or double type, the parameter values that correspond to the TSL data contain at least one decimal place. Examples: 10.0 and 11.1.</p>
     */
    @NameInMap("Args")
    public String args;

    /**
     * <p>The DeviceName of the device to which the required service belongs.</p>
     * <br>
     * <p>> If you configure this parameter, you must specify a value for the **ProductKey** parameter.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The identifier of the service.</p>
     * <br>
     * <p>You can use one of the following methods to view the **identifier** of the service:</p>
     * <br>
     * <p>*   Log on to the [IoT Platform console](https://iot.console.aliyun.com/). On the **Define Feature** tab of the product to which the device belongs, view the identifier.</p>
     * <p>*   Call the [QueryThingModel](~~150321~~) operation and view the identifier in the TSL information that is returned.</p>
     * <br>
     * <p>>  If a service named testService belongs to a custom module named testFb, you can set this parameter to ******testFb:testService******. The custom module is not the default module.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
     * <br>
     * <p>>The IotId parameter specifies a globally unique identifier (GUID) for the device. The value of the **IotId** parameter corresponds to a combination of the values of the **ProductKey** and **DeviceName** parameters. If you specify a value for this parameter, you do not need to configure the **ProductKey** or **DeviceName** parameter. If you specify values for the **IotId**,**ProductKey**, and **DeviceName** parameters, the value of the **IotId** parameter takes precedence.</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the elastic container instance. On the **Overview** page in the IoT Platform console, you can view the ID of the instance.****</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for the parameter. Otherwise, the call fails.********</p>
     * <p>>*   If no **Overview** page or **ID** is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <br>
     * <p>>If you configure this parameter, you must specify a value for the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Qos")
    public Integer qos;

    public static InvokeThingServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeThingServiceRequest self = new InvokeThingServiceRequest();
        return TeaModel.build(map, self);
    }

    public InvokeThingServiceRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public InvokeThingServiceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public InvokeThingServiceRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public InvokeThingServiceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public InvokeThingServiceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public InvokeThingServiceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public InvokeThingServiceRequest setQos(Integer qos) {
        this.qos = qos;
        return this;
    }
    public Integer getQos() {
        return this.qos;
    }

}
