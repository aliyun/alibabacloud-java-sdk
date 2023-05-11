// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelPublishedRequest extends TeaModel {
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
     * <p>The ProductKey of the product.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static QueryThingModelPublishedRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelPublishedRequest self = new QueryThingModelPublishedRequest();
        return TeaModel.build(map, self);
    }

    public QueryThingModelPublishedRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public QueryThingModelPublishedRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryThingModelPublishedRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public QueryThingModelPublishedRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryThingModelPublishedRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
