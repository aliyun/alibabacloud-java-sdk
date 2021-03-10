// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateThingModelRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("ThingModelJson")
    public String thingModelJson;

    @NameInMap("FunctionBlockId")
    public String functionBlockId;

    @NameInMap("FunctionBlockName")
    public String functionBlockName;

    public static UpdateThingModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingModelRequest self = new UpdateThingModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateThingModelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateThingModelRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateThingModelRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public UpdateThingModelRequest setThingModelJson(String thingModelJson) {
        this.thingModelJson = thingModelJson;
        return this;
    }
    public String getThingModelJson() {
        return this.thingModelJson;
    }

    public UpdateThingModelRequest setFunctionBlockId(String functionBlockId) {
        this.functionBlockId = functionBlockId;
        return this;
    }
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    public UpdateThingModelRequest setFunctionBlockName(String functionBlockName) {
        this.functionBlockName = functionBlockName;
        return this;
    }
    public String getFunctionBlockName() {
        return this.functionBlockName;
    }

}
