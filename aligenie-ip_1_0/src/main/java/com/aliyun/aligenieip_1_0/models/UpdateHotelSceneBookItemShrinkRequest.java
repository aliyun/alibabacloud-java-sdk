// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelSceneBookItemShrinkRequest extends TeaModel {
    /**
     * <p>hotelID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80d84ea8ed9e422fbad52715c8fc56f1</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>updateHotelSceneBookReq</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateHotelSceneBookReq")
    public String updateHotelSceneBookReqShrink;

    public static UpdateHotelSceneBookItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelSceneBookItemShrinkRequest self = new UpdateHotelSceneBookItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHotelSceneBookItemShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateHotelSceneBookItemShrinkRequest setUpdateHotelSceneBookReqShrink(String updateHotelSceneBookReqShrink) {
        this.updateHotelSceneBookReqShrink = updateHotelSceneBookReqShrink;
        return this;
    }
    public String getUpdateHotelSceneBookReqShrink() {
        return this.updateHotelSceneBookReqShrink;
    }

}
