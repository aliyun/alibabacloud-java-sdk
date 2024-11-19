// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CopyThingModelRequest extends TeaModel {
    /**
     * <p>The ID of the instance. On the <strong>Overview</strong> page in the IoT Platform console, you can view the ID of the instance.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</li>
     * <li>If the <strong>Overview</strong> page or instance ID is not displayed in the IoT Platform console, ignore this parameter.</li>
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
     * <p>The ID of the resource group.</p>
     * <blockquote>
     * <p> You do not need to configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm4l5tcwd****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The version of the TSL model that you want to copy.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/150318.html">ListThingModelVersion</a> operation to view the TSL model versions of a product.</p>
     * 
     * <strong>example:</strong>
     * <p>V1.0.0</p>
     */
    @NameInMap("SourceModelVersion")
    public String sourceModelVersion;

    /**
     * <p>The ProductKey of the source product.</p>
     * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("SourceProductKey")
    public String sourceProductKey;

    /**
     * <p>The ProductKey of the destination product.</p>
     * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwwG0****</p>
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
