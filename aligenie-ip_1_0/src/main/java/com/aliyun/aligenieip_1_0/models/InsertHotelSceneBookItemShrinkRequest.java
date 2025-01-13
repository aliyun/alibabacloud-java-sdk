// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class InsertHotelSceneBookItemShrinkRequest extends TeaModel {
    /**
     * <p>addHotelSceneItemReq</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddHotelSceneItemReq")
    public String addHotelSceneItemReqShrink;

    /**
     * <p>hotelID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80d84ea8ed9e422fbad52715c8fc56f1</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    public static InsertHotelSceneBookItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertHotelSceneBookItemShrinkRequest self = new InsertHotelSceneBookItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsertHotelSceneBookItemShrinkRequest setAddHotelSceneItemReqShrink(String addHotelSceneItemReqShrink) {
        this.addHotelSceneItemReqShrink = addHotelSceneItemReqShrink;
        return this;
    }
    public String getAddHotelSceneItemReqShrink() {
        return this.addHotelSceneItemReqShrink;
    }

    public InsertHotelSceneBookItemShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

}
