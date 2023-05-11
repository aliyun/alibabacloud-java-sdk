// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneItemsShrinkRequest extends TeaModel {
    /**
     * <p>hotelID</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>ListHotelSceneReq</p>
     */
    @NameInMap("ListHotelSceneReq")
    public String listHotelSceneReqShrink;

    public static ListHotelSceneItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneItemsShrinkRequest self = new ListHotelSceneItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneItemsShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListHotelSceneItemsShrinkRequest setListHotelSceneReqShrink(String listHotelSceneReqShrink) {
        this.listHotelSceneReqShrink = listHotelSceneReqShrink;
        return this;
    }
    public String getListHotelSceneReqShrink() {
        return this.listHotelSceneReqShrink;
    }

}
