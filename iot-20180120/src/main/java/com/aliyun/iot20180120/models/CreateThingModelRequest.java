// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateThingModelRequest extends TeaModel {
    /**
     * <p>The identifier of the custom TSL module. Each identifier is unique in a product. The identifier must be 1 to 30 characters in length, and can contain letters, digits, and underscores (_).</p>
     * <p>This parameter must be used in combination with the <strong>FunctionBlockName</strong> parameter. If you do not specify this parameter, the system imports the default module.</p>
     * 
     * <strong>example:</strong>
     * <p>BatteryModule</p>
     */
    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    /**
     * <p>The name of the custom module. The name must be 4 to 30 characters in length, and can contain letters, digits, and underscores (_).</p>
     * <p>This parameter must be used in combination with the <strong>FunctionBlockId</strong> parameter. If you do not specify this parameter, the system imports the default module.</p>
     */
    @NameInMap("FunctionBlockName")
    public String functionBlockName;

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
     * <p>The details of the new features.</p>
     * <blockquote>
     * <p> You can specify a maximum of 10 features.</p>
     * </blockquote>
     * <p>Example:</p>
     * <pre><code>
     * {
     *   &quot;properties&quot;: [
     *     {
     *       &quot;custom&quot;: true,
     *       &quot;dataSpecsList&quot;: [
     *         {
     *           &quot;childDataType&quot;: &quot;TEXT&quot;,
     *           &quot;childName&quot;: &quot;CCID number of the device SIM card&quot;,
     *           &quot;dataSpecs&quot;: {
     *             &quot;custom&quot;: true,
     *             &quot;dataType&quot;: &quot;TEXT&quot;,
     *             &quot;length&quot;: 20
     *           },
     *           &quot;dataType&quot;: &quot;STRUCT&quot;,
     *           &quot;identifier&quot;: &quot;CCID&quot;,
     *           &quot;name&quot;: &quot;CCID number of the device SIM card&quot;
     *         },
     *         {
     *           &quot;childDataType&quot;: &quot;INT&quot;,
     *           &quot;childName&quot;: &quot;Battery power&quot;,
     *           &quot;dataSpecs&quot;: {
     *             &quot;custom&quot;: true,
     *             &quot;dataType&quot;: &quot;INT&quot;,
     *             &quot;max&quot;: &quot;60000&quot;,
     *             &quot;min&quot;: &quot;0&quot;,
     *             &quot;step&quot;: &quot;1&quot;
     *           },
     *           &quot;dataType&quot;: &quot;STRUCT&quot;,
     *           &quot;identifier&quot;: &quot;battery&quot;,
     *           &quot;name&quot;: &quot;Battery power&quot;
     *         },
     *         {
     *           &quot;childDataType&quot;: &quot;TEXT&quot;,
     *           &quot;childName&quot;: &quot;Other information&quot;,
     *           &quot;dataSpecs&quot;: {
     *             &quot;custom&quot;: true,
     *             &quot;dataType&quot;: &quot;TEXT&quot;,
     *             &quot;length&quot;: 1024
     *           },
     *           &quot;dataType&quot;: &quot;STRUCT&quot;,
     *           &quot;identifier&quot;: &quot;other_info&quot;,
     *           &quot;name&quot;: &quot;Other information&quot;
     *         }
     *       ],
     *       &quot;dataType&quot;: &quot;STRUCT&quot;,
     *       &quot;identifier&quot;: &quot;DEV_INFO&quot;,
     *       &quot;name&quot;: &quot;Device information&quot;,
     *       &quot;productKey&quot;: &quot;a1T***&quot;,
     *       &quot;propertyId&quot;: 18786548,
     *       &quot;required&quot;: false,
     *       &quot;rwFlag&quot;: &quot;READ_ONLY&quot;
     *     },
     *     {
     *       &quot;custom&quot;: true,
     *       &quot;dataSpecs&quot;: {
     *         &quot;childDataType&quot;: &quot;INT&quot;,
     *         &quot;custom&quot;: true,
     *         &quot;dataType&quot;: &quot;ARRAY&quot;,
     *         &quot;size&quot;: 1,
     *         &quot;dataSpecs&quot;: {
     *           &quot;custom&quot;: true,
     *           &quot;dataType&quot;: &quot;INT&quot;,
     *           &quot;max&quot;: &quot;65535&quot;,
     *           &quot;min&quot;: &quot;0&quot;,
     *           &quot;step&quot;: &quot;1&quot;,
     *           &quot;unit&quot;: &quot;ppm&quot;,
     *           &quot;unitName&quot;: &quot;Parts per million&quot;
     *         }
     *       },
     *       &quot;dataType&quot;: &quot;ARRAY&quot;,
     *       &quot;identifier&quot;: &quot;airRH_SR&quot;,
     *       &quot;name&quot;: &quot;Dehumidifier humidity&quot;,
     *       &quot;productKey&quot;: &quot;a1T***&quot;,
     *       &quot;propertyId&quot;: 18786551,
     *       &quot;required&quot;: false,
     *       &quot;rwFlag&quot;: &quot;READ_ONLY&quot;
     *     }
     *   ],
     *   &quot;services&quot;: [...],
     *   &quot;events&quot;: [...]
     * }
     *                                 
     * </code></pre>
     * <p>In the <strong>properties</strong> structure of the <strong>ThingModelJson</strong> parameter, you can use the <strong>extendConfig</strong> parameter to define the extended information of the TSL model. For more information, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</p>
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
