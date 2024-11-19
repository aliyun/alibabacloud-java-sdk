// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ImportThingModelTslRequest extends TeaModel {
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
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product.</p>
     * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the resource group.</p>
     * <blockquote>
     * <p> You cannot specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm4l5tcwd****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The TSL model to be edited. The value is a JSON string. The TSL model defines the properties, services, and events of the product.</p>
     * <p>The value of the <strong>TslStr</strong> parameter must conform to the standard TSL data format. For more information, see <a href="https://help.aliyun.com/document_detail/73727.html">TSL data format</a>.</p>
     * <blockquote>
     * <p> To import a TSL model, you must specify the <strong>TslStr</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;schema&quot;:&quot;<a href="https://iotx-tsl.oss-ap-southeast-1.aliyuncs.com/schema.json%22,%22profile%22:%7B%22productKey%22:%22a14TeW****%22%7D,%22properties%22:%5B%5D%7D">https://iotx-tsl.oss-ap-southeast-1.aliyuncs.com/schema.json&quot;,&quot;profile&quot;:{&quot;productKey&quot;:&quot;a14TeW****&quot;},&quot;properties&quot;:[]}</a></p>
     */
    @NameInMap("TslStr")
    public String tslStr;

    /**
     * <p>The URI that is used to store the TSL data in Object Storage Service (OSS).</p>
     * <blockquote>
     * <p> This parameter does not take effect. To import a TSL model, you must specify the <strong>TslStr</strong> parameter.</p>
     * </blockquote>
     */
    @NameInMap("TslUrl")
    public String tslUrl;

    public static ImportThingModelTslRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportThingModelTslRequest self = new ImportThingModelTslRequest();
        return TeaModel.build(map, self);
    }

    public ImportThingModelTslRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public ImportThingModelTslRequest setFunctionBlockName(String functionBlockName) {
        this.functionBlockName = functionBlockName;
        return this;
    }
    public String getFunctionBlockName() {
        return this.functionBlockName;
    }

    public ImportThingModelTslRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ImportThingModelTslRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ImportThingModelTslRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ImportThingModelTslRequest setTslStr(String tslStr) {
        this.tslStr = tslStr;
        return this;
    }
    public String getTslStr() {
        return this.tslStr;
    }

    public ImportThingModelTslRequest setTslUrl(String tslUrl) {
        this.tslUrl = tslUrl;
        return this;
    }
    public String getTslUrl() {
        return this.tslUrl;
    }

}
