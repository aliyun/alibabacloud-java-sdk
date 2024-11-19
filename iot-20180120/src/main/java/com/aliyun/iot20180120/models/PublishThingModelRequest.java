// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PublishThingModelRequest extends TeaModel {
    /**
     * <p>The description of the TSL model version.</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>The version number of the TSL model.</p>
     * <p>The version number must be 1 to 16 characters in length and can contain letters, digits, and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>v1.0.0</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

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

    public static PublishThingModelRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishThingModelRequest self = new PublishThingModelRequest();
        return TeaModel.build(map, self);
    }

    public PublishThingModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PublishThingModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public PublishThingModelRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public PublishThingModelRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public PublishThingModelRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
