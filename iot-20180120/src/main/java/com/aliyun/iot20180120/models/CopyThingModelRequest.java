// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CopyThingModelRequest extends TeaModel {
    /**
     * <p>The ID of the instance. On the **Overview** page in the IoT Platform console, you can view the ID of the instance.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</p>
     * <p>>*   If the **Overview** page or instance ID is not displayed in the IoT Platform console, ignore this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>>  You do not need to configure this parameter.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The version of the TSL model that you want to copy.</p>
     * <br>
     * <p>You can call the [ListThingModelVersion](~~150318~~) operation to view the TSL model versions of a product.</p>
     */
    @NameInMap("SourceModelVersion")
    public String sourceModelVersion;

    /**
     * <p>The ProductKey of the source product.</p>
     * <br>
     * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the [QueryProductList](~~69271~~) operation.</p>
     */
    @NameInMap("SourceProductKey")
    public String sourceProductKey;

    /**
     * <p>The ProductKey of the destination product.</p>
     * <br>
     * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the [QueryProductList](~~69271~~) operation.</p>
     */
    @NameInMap("TargetProductKey")
    public String targetProductKey;

    public static CopyThingModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyThingModelRequest self = new CopyThingModelRequest();
        return TeaModel.build(map, self);
    }

    public CopyThingModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CopyThingModelRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CopyThingModelRequest setSourceModelVersion(String sourceModelVersion) {
        this.sourceModelVersion = sourceModelVersion;
        return this;
    }
    public String getSourceModelVersion() {
        return this.sourceModelVersion;
    }

    public CopyThingModelRequest setSourceProductKey(String sourceProductKey) {
        this.sourceProductKey = sourceProductKey;
        return this;
    }
    public String getSourceProductKey() {
        return this.sourceProductKey;
    }

    public CopyThingModelRequest setTargetProductKey(String targetProductKey) {
        this.targetProductKey = targetProductKey;
        return this;
    }
    public String getTargetProductKey() {
        return this.targetProductKey;
    }

}
