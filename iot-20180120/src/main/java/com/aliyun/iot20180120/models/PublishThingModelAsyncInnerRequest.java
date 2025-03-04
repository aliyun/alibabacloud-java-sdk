// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PublishThingModelAsyncInnerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InsId")
    public String insId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static PublishThingModelAsyncInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishThingModelAsyncInnerRequest self = new PublishThingModelAsyncInnerRequest();
        return TeaModel.build(map, self);
    }

    public PublishThingModelAsyncInnerRequest setInsId(String insId) {
        this.insId = insId;
        return this;
    }
    public String getInsId() {
        return this.insId;
    }

    public PublishThingModelAsyncInnerRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public PublishThingModelAsyncInnerRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
