// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterSceneAudioRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("SceneId")
    public String sceneId;

    public static DescribeCasterSceneAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterSceneAudioRequest self = new DescribeCasterSceneAudioRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasterSceneAudioRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCasterSceneAudioRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterSceneAudioRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
