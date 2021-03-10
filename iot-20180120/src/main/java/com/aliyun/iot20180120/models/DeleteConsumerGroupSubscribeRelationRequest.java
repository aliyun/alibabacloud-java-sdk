// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupSubscribeRelationRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("ConsumerGroupId")
    public String consumerGroupId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    public static DeleteConsumerGroupSubscribeRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerGroupSubscribeRelationRequest self = new DeleteConsumerGroupSubscribeRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerGroupSubscribeRelationRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public DeleteConsumerGroupSubscribeRelationRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public DeleteConsumerGroupSubscribeRelationRequest setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    public DeleteConsumerGroupSubscribeRelationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteConsumerGroupSubscribeRelationRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
