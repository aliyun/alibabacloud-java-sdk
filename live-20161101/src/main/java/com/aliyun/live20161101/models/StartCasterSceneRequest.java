// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartCasterSceneRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    public static StartCasterSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCasterSceneRequest self = new StartCasterSceneRequest();
        return TeaModel.build(map, self);
    }

    public StartCasterSceneRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public StartCasterSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
