// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneBookItemsShrinkRequest extends TeaModel {
    /**
     * <p>hotelID</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Page")
    public String pageShrink;

    @NameInMap("Type")
    public String type;

    public static ListHotelSceneBookItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneBookItemsShrinkRequest self = new ListHotelSceneBookItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneBookItemsShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListHotelSceneBookItemsShrinkRequest setPageShrink(String pageShrink) {
        this.pageShrink = pageShrink;
        return this;
    }
    public String getPageShrink() {
        return this.pageShrink;
    }

    public ListHotelSceneBookItemsShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
