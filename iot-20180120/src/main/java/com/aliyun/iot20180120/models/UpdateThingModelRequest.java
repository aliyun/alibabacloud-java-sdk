// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateThingModelRequest extends TeaModel {
    /**
     * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
     * <br>
     * <p>If you do not specify this parameter or the **FunctionBlockName** parameter, the system updates the features of the default module.</p>
     */
    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    /**
     * <p>The name of the custom module. The name must be 4 to 30 characters in length, and can contain letters, digits, and underscores (\_).</p>
     * <br>
     * <p>*   If you do not specify this parameter or the **FunctionBlockId** parameter, the system updates the features of the default module.</p>
     * <p>*   If you specify this parameter, the parameter must be used in combination with the **FunctionBlockId** parameter. You can modify the name of the specified custom module. The name corresponds to the value of the **FunctionBlockId** parameter.</p>
     * <br>
     * <p>>  You cannot modify the name of the default module.</p>
     */
    @NameInMap("FunctionBlockName")
    public String functionBlockName;

    /**
     * <p>The identifier of the feature.</p>
     * <br>
     * <p>You can call the [GetThingModelTsl](~~150319~~) operation and view the identifier in the **TslStr** response parameter.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The **ProductKey** of the product.</p>
     * <br>
     * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the [QueryProductList](~~69271~~) operation.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The updated details of the feature.</p>
     * <br>
     * <p>*   If you specify the **Identifier** parameter, you can define only the identifier of the feature.</p>
     * <p>*   If you do not specify the **Identifier** parameter, you can define a maximum of 50 input and output parameters for a service or event.</p>
     * <br>
     * <p>For more information about how to specify this parameter, see [Data structure of ThingModelJson](~~150457~~).</p>
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
