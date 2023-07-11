// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class CreateRcuSceneShrinkRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("SceneRelationExtDTO")
    public String sceneRelationExtDTOShrink;

    public static CreateRcuSceneShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRcuSceneShrinkRequest self = new CreateRcuSceneShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRcuSceneShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public CreateRcuSceneShrinkRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CreateRcuSceneShrinkRequest setSceneRelationExtDTOShrink(String sceneRelationExtDTOShrink) {
        this.sceneRelationExtDTOShrink = sceneRelationExtDTOShrink;
        return this;
    }
    public String getSceneRelationExtDTOShrink() {
        return this.sceneRelationExtDTOShrink;
    }

}
