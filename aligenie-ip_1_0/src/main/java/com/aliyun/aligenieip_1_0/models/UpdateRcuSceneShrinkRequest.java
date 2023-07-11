// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateRcuSceneShrinkRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("SceneRelationExtDTO")
    public String sceneRelationExtDTOShrink;

    public static UpdateRcuSceneShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRcuSceneShrinkRequest self = new UpdateRcuSceneShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRcuSceneShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateRcuSceneShrinkRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public UpdateRcuSceneShrinkRequest setSceneRelationExtDTOShrink(String sceneRelationExtDTOShrink) {
        this.sceneRelationExtDTOShrink = sceneRelationExtDTOShrink;
        return this;
    }
    public String getSceneRelationExtDTOShrink() {
        return this.sceneRelationExtDTOShrink;
    }

}
