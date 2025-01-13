// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateHotelSceneItemShrinkRequest extends TeaModel {
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
     * <p>updateHotelSceneReq</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateHotelSceneOperateReq")
    public String updateHotelSceneOperateReqShrink;

    /**
     * <p>UpdateHotelSceneReq</p>
     * <p>This parameter is required.</p>
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
