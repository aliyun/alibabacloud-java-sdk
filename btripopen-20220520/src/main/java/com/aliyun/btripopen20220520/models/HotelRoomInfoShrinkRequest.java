// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelRoomInfoShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("room_ids")
    public String roomIdsShrink;

    public static HotelRoomInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelRoomInfoShrinkRequest self = new HotelRoomInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HotelRoomInfoShrinkRequest setRoomIdsShrink(String roomIdsShrink) {
        this.roomIdsShrink = roomIdsShrink;
        return this;
    }
    public String getRoomIdsShrink() {
        return this.roomIdsShrink;
    }

}
