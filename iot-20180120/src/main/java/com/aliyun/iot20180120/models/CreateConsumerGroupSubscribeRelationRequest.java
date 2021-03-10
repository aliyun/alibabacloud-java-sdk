// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupSubscribeRelationRequest extends TeaModel {
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

    public static CreateConsumerGroupSubscribeRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerGroupSubscribeRelationRequest self = new CreateConsumerGroupSubscribeRelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerGroupSubscribeRelationRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateConsumerGroupSubscribeRelationRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CreateConsumerGroupSubscribeRelationRequest setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    public CreateConsumerGroupSubscribeRelationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateConsumerGroupSubscribeRelationRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
