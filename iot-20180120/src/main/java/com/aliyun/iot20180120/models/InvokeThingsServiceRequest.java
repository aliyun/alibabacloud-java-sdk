// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeThingsServiceRequest extends TeaModel {
    /**
     * <p>The input parameter of the service. The value is a JSON string. Example: <strong>Args={&quot;param1&quot;: 1}</strong>.</p>
     * <p>If this parameter is left empty, set the value to <strong>Args={}</strong>.</p>
     * <blockquote>
     * <p>If the TSL data is of the float or double type, the parameter values that correspond to the TSL data contain at least one decimal place. Examples: 10.0 and 11.1.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;param1&quot;:1}</p>
     */
    @NameInMap("Args")
    public String args;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>device1</p>
     */
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    /**
     * <p>The identifier of the service.</p>
     * <p>You can use one of the following methods to view the <strong>identifier</strong> of the service.</p>
     * <ul>
     * <li>Log on to the IoT Platform console. On the <strong>Define Feature</strong> tab of the product to which the device belongs, you can view the identifier.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/150321.html">QueryThingModel</a> operation and view the identifier in the TSL information that is returned.</li>
     * </ul>
     * <blockquote>
     * <p> If a service named testService belongs to a custom module named testFb, you can set this parameter to <strong><strong><strong>testFb:testService</strong></strong></strong>. The custom module is not the default module.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Set</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.****</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</li>
     * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
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
