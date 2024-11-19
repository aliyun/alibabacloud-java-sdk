// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelTslRequest extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>BatteryModule</p>
     */
    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    /**
     * <p>The ProductKey of the product.</p>
     * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>Specifies whether to retrieve a simplified TSL model.</p>
     * <ul>
     * <li><p><strong>true</strong>: retrieves a simplified TSL model.</p>
     * <p>A simplified TSL model includes only the <strong>identifier</strong> and <strong>dataType</strong> attributes of properties, services, events, and related input or output parameters. Simplified TSL models can be used by device developers for reference.</p>
     * </li>
     * <li><p><strong>false</strong>: retrieves the complete TSL model.</p>
     * <p>A complete TSL model includes all the parameters and values of properties, services, and events. Complete TSL models can be used by cloud application developers for reference.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.0.0</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    /**
     * <p>The version number of the TSL model to be queried.</p>
     * <p>If you do not specify this parameter, IoT Platform returns the draft TSL model that is unpublished.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
     * <p>If you do not specify this parameter, the default module is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Simple")
    public Boolean simple;

    public static GetThingModelTslRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelTslRequest self = new GetThingModelTslRequest();
        return TeaModel.build(map, self);
    }

    public GetThingModelTslRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public GetThingModelTslRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetThingModelTslRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public GetThingModelTslRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public GetThingModelTslRequest setSimple(Boolean simple) {
        this.simple = simple;
        return this;
    }
    public Boolean getSimple() {
        return this.simple;
    }

}
