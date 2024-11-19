// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateThingModelRequest extends TeaModel {
    /**
     * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
     * <p>If you do not specify this parameter or the <strong>FunctionBlockName</strong> parameter, the system updates the features of the default module.</p>
     * 
     * <strong>example:</strong>
     * <p>BatteryModule</p>
     */
    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    /**
     * <p>The name of the custom module. The name must be 4 to 30 characters in length, and can contain letters, digits, and underscores (_).</p>
     * <ul>
     * <li>If you do not specify this parameter or the <strong>FunctionBlockId</strong> parameter, the system updates the features of the default module.</li>
     * <li>If you specify this parameter, the parameter must be used in combination with the <strong>FunctionBlockId</strong> parameter. You can modify the name of the specified custom module. The name corresponds to the value of the <strong>FunctionBlockId</strong> parameter.</li>
     * </ul>
     * <blockquote>
     * <p> You cannot modify the name of the default module.</p>
     * </blockquote>
     */
    @NameInMap("FunctionBlockName")
    public String functionBlockName;

    /**
     * <p>The identifier of the feature.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/150319.html">GetThingModelTsl</a> operation and view the identifier in the <strong>TslStr</strong> response parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Temperature</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The <strong>ProductKey</strong> of the product.</p>
     * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The updated details of the feature.</p>
     * <ul>
     * <li>If you specify the <strong>Identifier</strong> parameter, you can define only the identifier of the feature.</li>
     * <li>If you do not specify the <strong>Identifier</strong> parameter, you can define a maximum of 50 input and output parameters for a service or event.</li>
     * </ul>
     * <p>For more information about how to specify this parameter, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</p>
     */
    @NameInMap("ThingModelJson")
    public String thingModelJson;

    public static UpdateThingModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingModelRequest self = new UpdateThingModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateThingModelRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public UpdateThingModelRequest setFunctionBlockName(String functionBlockName) {
        this.functionBlockName = functionBlockName;
        return this;
    }
    public String getFunctionBlockName() {
        return this.functionBlockName;
    }

    public UpdateThingModelRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public UpdateThingModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateThingModelRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateThingModelRequest setThingModelJson(String thingModelJson) {
        this.thingModelJson = thingModelJson;
        return this;
    }
    public String getThingModelJson() {
        return this.thingModelJson;
    }

}
