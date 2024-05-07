// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CreateGoodsShippingNoticeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public GoodsShippingNoticeCreateCmd body;

    public static CreateGoodsShippingNoticeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGoodsShippingNoticeRequest self = new CreateGoodsShippingNoticeRequest();
        return TeaModel.build(map, self);
    }

    public CreateGoodsShippingNoticeRequest setBody(GoodsShippingNoticeCreateCmd body) {
        this.body = body;
        return this;
    }
    public GoodsShippingNoticeCreateCmd getBody() {
        return this.body;
    }

}
