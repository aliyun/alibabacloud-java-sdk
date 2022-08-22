// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelOrderDetailShrinkRequest extends TeaModel {
    @NameInMap("Payload")
    public String payloadShrink;

    public static GetHotelOrderDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelOrderDetailShrinkRequest self = new GetHotelOrderDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelOrderDetailShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

}
