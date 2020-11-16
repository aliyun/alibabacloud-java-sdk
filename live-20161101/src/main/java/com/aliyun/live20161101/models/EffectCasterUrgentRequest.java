// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EffectCasterUrgentRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    public static EffectCasterUrgentRequest build(java.util.Map<String, ?> map) throws Exception {
        EffectCasterUrgentRequest self = new EffectCasterUrgentRequest();
        return TeaModel.build(map, self);
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
