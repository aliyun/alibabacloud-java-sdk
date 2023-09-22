// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeThingsServiceRequest extends TeaModel {
    /**
     * <p>The input parameter of the service. The value is a JSON string. Example: **Args={"param1": 1}**.</p>
     * <br>
     * <p>If this parameter is left empty, set the value to **Args={}**.</p>
     * <br>
     * <p>>If the TSL data is of the float or double type, the parameter values that correspond to the TSL data contain at least one decimal place. Examples: 10.0 and 11.1.</p>
     */
    @NameInMap("Args")
    public String args;

    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    /**
     * <p>The identifier of the service.</p>
     * <br>
     * <p>You can use one of the following methods to view the **identifier** of the service.</p>
     * <br>
     * <p>*   Log on to the IoT Platform console. On the **Define Feature** tab of the product to which the device belongs, you can view the identifier.</p>
     * <p>*   Call the [QueryThingModel](~~150321~~) operation and view the identifier in the TSL information that is returned.</p>
     * <br>
     * <p>>  If a service named testService belongs to a custom module named testFb, you can set this parameter to ******testFb:testService******. The custom module is not the default module.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the instance. You can view the ID of the instance on the **Overview** page in the IoT Platform console.****</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</p>
     * <p>>*   If no **Overview** page or **ID** is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The **ProductKey** of the product to which the device belongs.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Qos")
    public Integer qos;

    public static InvokeThingsServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeThingsServiceRequest self = new InvokeThingsServiceRequest();
        return TeaModel.build(map, self);
    }

    public InvokeThingsServiceRequest setArgs(String args) {
        this.args = args;
        return this;
    }
    public String getArgs() {
        return this.args;
    }

    public InvokeThingsServiceRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public InvokeThingsServiceRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public InvokeThingsServiceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public InvokeThingsServiceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public InvokeThingsServiceRequest setQos(Integer qos) {
        this.qos = qos;
        return this;
    }
    public Integer getQos() {
        return this.qos;
    }

}
