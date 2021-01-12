// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkwan20181030.models;

import com.aliyun.tea.*;

public class GetKpmEncryptedNodeTuplesByOrderIdRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("OrderId")
    public Long orderId;

    public static GetKpmEncryptedNodeTuplesByOrderIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKpmEncryptedNodeTuplesByOrderIdRequest self = new GetKpmEncryptedNodeTuplesByOrderIdRequest();
        return TeaModel.build(map, self);
    }

    public GetKpmEncryptedNodeTuplesByOrderIdRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public GetKpmEncryptedNodeTuplesByOrderIdRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public GetKpmEncryptedNodeTuplesByOrderIdRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
