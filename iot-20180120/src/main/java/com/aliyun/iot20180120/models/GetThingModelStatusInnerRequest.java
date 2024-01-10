// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelStatusInnerRequest extends TeaModel {
    @NameInMap("InsId")
    public String insId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    public static GetThingModelStatusInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelStatusInnerRequest self = new GetThingModelStatusInnerRequest();
        return TeaModel.build(map, self);
    }

    public GetThingModelStatusInnerRequest setInsId(String insId) {
        this.insId = insId;
        return this;
    }
    public String getInsId() {
        return this.insId;
    }

    public GetThingModelStatusInnerRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetThingModelStatusInnerRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
