// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PushHotelMessageShrinkRequest extends TeaModel {
    /**
     * <p>pushHotelMessageReq</p>
     */
    @NameInMap("PushHotelMessageReq")
    public String pushHotelMessageReqShrink;

    public static PushHotelMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushHotelMessageShrinkRequest self = new PushHotelMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushHotelMessageShrinkRequest setPushHotelMessageReqShrink(String pushHotelMessageReqShrink) {
        this.pushHotelMessageReqShrink = pushHotelMessageReqShrink;
        return this;
    }
    public String getPushHotelMessageReqShrink() {
        return this.pushHotelMessageReqShrink;
    }

}
