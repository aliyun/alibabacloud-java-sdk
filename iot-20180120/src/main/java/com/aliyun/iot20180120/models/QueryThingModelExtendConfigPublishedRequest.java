// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelExtendConfigPublishedRequest extends TeaModel {
    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ModelVersion")
    public String modelVersion;

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
