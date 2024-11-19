// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelExtendConfigPublishedRequest extends TeaModel {
    /**
     * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
     * <p>If you do not specify this parameter, the default module is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>BatteryModule</p>
     */
    @NameInMap("FunctionBlockId")
    public String functionBlockId;

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
     * <p>The version number of the TSL model. If you do not specify this parameter, the last published TSL model is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.0.0</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

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

    public static QueryThingModelExtendConfigPublishedRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelExtendConfigPublishedRequest self = new QueryThingModelExtendConfigPublishedRequest();
        return TeaModel.build(map, self);
    }

    public QueryThingModelExtendConfigPublishedRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public QueryThingModelExtendConfigPublishedRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryThingModelExtendConfigPublishedRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public QueryThingModelExtendConfigPublishedRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
