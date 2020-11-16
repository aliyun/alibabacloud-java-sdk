// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterSceneConfigRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    public static DeleteCasterSceneConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterSceneConfigRequest self = new DeleteCasterSceneConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCasterSceneConfigRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterSceneConfigRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public DeleteCasterSceneConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
