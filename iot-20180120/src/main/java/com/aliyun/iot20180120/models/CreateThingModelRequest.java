// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateThingModelRequest extends TeaModel {
    /**
     * <p>The identifier of the custom TSL module. Each identifier is unique in a product. The identifier must be 1 to 30 characters in length, and can contain letters, digits, and underscores (\_).</p>
     * <br>
     * <p>This parameter must be used in combination with the **FunctionBlockName** parameter. If you do not specify this parameter, the system imports the default module.</p>
     */
    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    /**
     * <p>The name of the custom module. The name must be 4 to 30 characters in length, and can contain letters, digits, and underscores (\_).</p>
     * <br>
     * <p>This parameter must be used in combination with the **FunctionBlockId** parameter. If you do not specify this parameter, the system imports the default module.</p>
     */
    @NameInMap("FunctionBlockName")
    public String functionBlockName;

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
     * <p>The details of the new features.</p>
     * <br>
     * <p>>  You can specify a maximum of 10 features.</p>
     * <br>
     * <p>Example:</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "properties": [</p>
     * <p>    {</p>
     * <p>      "custom": true,</p>
     * <p>      "dataSpecsList": [</p>
     * <p>        {</p>
     * <p>          "childDataType": "TEXT",</p>
     * <p>          "childName": "CCID number of the device SIM card",</p>
     * <p>          "dataSpecs": {</p>
     * <p>            "custom": true,</p>
     * <p>            "dataType": "TEXT",</p>
     * <p>            "length": 20</p>
     * <p>          },</p>
     * <p>          "dataType": "STRUCT",</p>
     * <p>          "identifier": "CCID",</p>
     * <p>          "name": "CCID number of the device SIM card"</p>
     * <p>        },</p>
     * <p>        {</p>
     * <p>          "childDataType": "INT",</p>
     * <p>          "childName": "Battery power",</p>
     * <p>          "dataSpecs": {</p>
     * <p>            "custom": true,</p>
     * <p>            "dataType": "INT",</p>
     * <p>            "max": "60000",</p>
     * <p>            "min": "0",</p>
     * <p>            "step": "1"</p>
     * <p>          },</p>
     * <p>          "dataType": "STRUCT",</p>
     * <p>          "identifier": "battery",</p>
     * <p>          "name": "Battery power"</p>
     * <p>        },</p>
     * <p>        {</p>
     * <p>          "childDataType": "TEXT",</p>
     * <p>          "childName": "Other information",</p>
     * <p>          "dataSpecs": {</p>
     * <p>            "custom": true,</p>
     * <p>            "dataType": "TEXT",</p>
     * <p>            "length": 1024</p>
     * <p>          },</p>
     * <p>          "dataType": "STRUCT",</p>
     * <p>          "identifier": "other_info",</p>
     * <p>          "name": "Other information"</p>
     * <p>        }</p>
     * <p>      ],</p>
     * <p>      "dataType": "STRUCT",</p>
     * <p>      "identifier": "DEV_INFO",</p>
     * <p>      "name": "Device information",</p>
     * <p>      "productKey": "a1T***",</p>
     * <p>      "propertyId": 18786548,</p>
     * <p>      "required": false,</p>
     * <p>      "rwFlag": "READ_ONLY"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>      "custom": true,</p>
     * <p>      "dataSpecs": {</p>
     * <p>        "childDataType": "INT",</p>
     * <p>        "custom": true,</p>
     * <p>        "dataType": "ARRAY",</p>
     * <p>        "size": 1,</p>
     * <p>        "dataSpecs": {</p>
     * <p>          "custom": true,</p>
     * <p>          "dataType": "INT",</p>
     * <p>          "max": "65535",</p>
     * <p>          "min": "0",</p>
     * <p>          "step": "1",</p>
     * <p>          "unit": "ppm",</p>
     * <p>          "unitName": "Parts per million"</p>
     * <p>        }</p>
     * <p>      },</p>
     * <p>      "dataType": "ARRAY",</p>
     * <p>      "identifier": "airRH_SR",</p>
     * <p>      "name": "Dehumidifier humidity",</p>
     * <p>      "productKey": "a1T***",</p>
     * <p>      "propertyId": 18786551,</p>
     * <p>      "required": false,</p>
     * <p>      "rwFlag": "READ_ONLY"</p>
     * <p>    }</p>
     * <p>  ],</p>
     * <p>  "services": [...],</p>
     * <p>  "events": [...]</p>
     * <p>}</p>
     * <p>                                </p>
     * <p>```</p>
     * <br>
     * <p>In the **properties** structure of the **ThingModelJson** parameter, you can use the **extendConfig** parameter to define the extended information of the TSL model. For more information, see [Data structure of ThingModelJson](~~150457~~).</p>
     */
    @NameInMap("ThingModelJson")
    public String thingModelJson;

    public static CreateThingModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateThingModelRequest self = new CreateThingModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateThingModelRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public CreateThingModelRequest setFunctionBlockName(String functionBlockName) {
        this.functionBlockName = functionBlockName;
        return this;
    }
    public String getFunctionBlockName() {
        return this.functionBlockName;
    }

    public CreateThingModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateThingModelRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateThingModelRequest setThingModelJson(String thingModelJson) {
        this.thingModelJson = thingModelJson;
        return this;
    }
    public String getThingModelJson() {
        return this.thingModelJson;
    }

}
