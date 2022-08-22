// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelServiceCategoryShrinkRequest extends TeaModel {
    @NameInMap("Payload")
    public String payloadShrink;

    public static ListHotelServiceCategoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelServiceCategoryShrinkRequest self = new ListHotelServiceCategoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelServiceCategoryShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

}
