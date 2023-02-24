// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelSceneItemShrinkRequest extends TeaModel {
    /**
     * <p>hotelID</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>updateHotelSceneReq</p>
     */
    @NameInMap("UpdateHotelSceneOperateReq")
    public String updateHotelSceneOperateReqShrink;

    /**
     * <p>UpdateHotelSceneReq</p>
     */
    @NameInMap("UpdateHotelSceneReq")
    public String updateHotelSceneReqShrink;

    public static UpdateHotelSceneItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotelSceneItemShrinkRequest self = new UpdateHotelSceneItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHotelSceneItemShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateHotelSceneItemShrinkRequest setUpdateHotelSceneOperateReqShrink(String updateHotelSceneOperateReqShrink) {
        this.updateHotelSceneOperateReqShrink = updateHotelSceneOperateReqShrink;
        return this;
    }
    public String getUpdateHotelSceneOperateReqShrink() {
        return this.updateHotelSceneOperateReqShrink;
    }

    public UpdateHotelSceneItemShrinkRequest setUpdateHotelSceneReqShrink(String updateHotelSceneReqShrink) {
        this.updateHotelSceneReqShrink = updateHotelSceneReqShrink;
        return this;
    }
    public String getUpdateHotelSceneReqShrink() {
        return this.updateHotelSceneReqShrink;
    }

}
