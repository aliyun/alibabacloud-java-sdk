// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class RenderRefundOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public RefundRenderCmd body;

    public static RenderRefundOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RenderRefundOrderRequest self = new RenderRefundOrderRequest();
        return TeaModel.build(map, self);
    }

    public RenderRefundOrderRequest setBody(RefundRenderCmd body) {
        this.body = body;
        return this;
    }
    public RefundRenderCmd getBody() {
        return this.body;
    }

}
