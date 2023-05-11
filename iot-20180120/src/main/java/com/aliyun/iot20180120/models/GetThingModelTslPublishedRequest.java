// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelTslPublishedRequest extends TeaModel {
    /**
     * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
     * <br>
     * <p>If you do not specify this parameter, the default module is queried.</p>
     */
    @NameInMap("FunctionBlockId")
    public String functionBlockId;

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
     * <p>The version number of the TSL model.</p>
     * <br>
     * <p>You can call the [ListThingModelVersion](~~150318~~) operation to view the version numbers of the TSL model for a product.</p>
     * <br>
     * <p>If you do not specify this parameter, the last published TSL model version is returned.</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    /**
     * <p>The **ProductKey** of the product.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>>  You cannot specify this parameter.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to retrieve a simplified TSL model.</p>
     * <br>
     * <p>*   true: retrieves a simplified TSL model. A simplified TSL model includes only the **identifier** and **dataType** attributes of properties, services, events, and related input or output parameters. Simplified TSL models can be used by device developers for reference.</p>
     * <p>*   false: retrieves the complete TSL model. A complete TSL model includes all the parameters and values of properties, services, and events. Complete TSL models can be used by cloud application developers for reference.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Simple")
    public Boolean simple;

    public static GetThingModelTslPublishedRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelTslPublishedRequest self = new GetThingModelTslPublishedRequest();
        return TeaModel.build(map, self);
    }

    public GetThingModelTslPublishedRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public GetThingModelTslPublishedRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetThingModelTslPublishedRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public GetThingModelTslPublishedRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public GetThingModelTslPublishedRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetThingModelTslPublishedRequest setSimple(Boolean simple) {
        this.simple = simple;
        return this;
    }
    public Boolean getSimple() {
        return this.simple;
    }

}
