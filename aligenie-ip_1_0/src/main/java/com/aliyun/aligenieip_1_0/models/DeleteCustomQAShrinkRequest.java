// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteCustomQAShrinkRequest extends TeaModel {
    @NameInMap("CustomQAIds")
    public String customQAIdsShrink;

    @NameInMap("HotelId")
    public String hotelId;

    public static DeleteCustomQAShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomQAShrinkRequest self = new DeleteCustomQAShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomQAShrinkRequest setCustomQAIdsShrink(String customQAIdsShrink) {
        this.customQAIdsShrink = customQAIdsShrink;
        return this;
    }
    public String getCustomQAIdsShrink() {
        return this.customQAIdsShrink;
    }

    public DeleteCustomQAShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
