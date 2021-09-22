// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class MatchRequest extends TeaModel {
    @NameInMap("pictureUrl")
    public String pictureUrl;

    @NameInMap("sceneId")
    public String sceneId;

    @NameInMap("floorId")
    public String floorId;

    @NameInMap("cameraId")
    public String cameraId;

    @NameInMap("cameraCoord")
    public java.util.List<Float> cameraCoord;

    public static MatchRequest build(java.util.Map<String, ?> map) throws Exception {
        MatchRequest self = new MatchRequest();
        return TeaModel.build(map, self);
    }

    public MatchRequest setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }
    public String getPictureUrl() {
        return this.pictureUrl;
    }

    public MatchRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public MatchRequest setFloorId(String floorId) {
        this.floorId = floorId;
        return this;
    }
    public String getFloorId() {
        return this.floorId;
    }

    public MatchRequest setCameraId(String cameraId) {
        this.cameraId = cameraId;
        return this;
    }
    public String getCameraId() {
        return this.cameraId;
    }

    public MatchRequest setCameraCoord(java.util.List<Float> cameraCoord) {
        this.cameraCoord = cameraCoord;
        return this;
    }
    public java.util.List<Float> getCameraCoord() {
        return this.cameraCoord;
    }

}
