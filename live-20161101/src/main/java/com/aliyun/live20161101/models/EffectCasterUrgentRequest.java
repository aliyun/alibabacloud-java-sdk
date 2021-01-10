// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EffectCasterUrgentRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("SceneId")
    public String sceneId;

    public static EffectCasterUrgentRequest build(java.util.Map<String, ?> map) throws Exception {
        EffectCasterUrgentRequest self = new EffectCasterUrgentRequest();
        return TeaModel.build(map, self);
    }

    public EffectCasterUrgentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EffectCasterUrgentRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public EffectCasterUrgentRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
