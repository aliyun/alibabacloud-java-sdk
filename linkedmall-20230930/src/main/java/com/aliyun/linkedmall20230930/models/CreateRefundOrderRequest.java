// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CreateRefundOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public RefundOrderCmd body;

    public static CreateRefundOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRefundOrderRequest self = new CreateRefundOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateRefundOrderRequest setBody(RefundOrderCmd body) {
        this.body = body;
        return this;
    }
    public RefundOrderCmd getBody() {
        return this.body;
    }

}
