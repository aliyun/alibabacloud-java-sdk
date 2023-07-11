// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteRcuSceneRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("SceneId")
    public String sceneId;

    public static DeleteRcuSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRcuSceneRequest self = new DeleteRcuSceneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRcuSceneRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public DeleteRcuSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
