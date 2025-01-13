// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ImportRoomGenieScenesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a7a3***013</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1211</p>
     */
    @NameInMap("RoomNo")
    public String roomNo;

    @NameInMap("SceneList")
    public String sceneListShrink;

    public static ImportRoomGenieScenesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportRoomGenieScenesShrinkRequest self = new ImportRoomGenieScenesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportRoomGenieScenesShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ImportRoomGenieScenesShrinkRequest setRoomNo(String roomNo) {
        this.roomNo = roomNo;
        return this;
    }
    public String getRoomNo() {
        return this.roomNo;
    }

    public ImportRoomGenieScenesShrinkRequest setSceneListShrink(String sceneListShrink) {
        this.sceneListShrink = sceneListShrink;
        return this;
    }
    public String getSceneListShrink() {
        return this.sceneListShrink;
    }

}
