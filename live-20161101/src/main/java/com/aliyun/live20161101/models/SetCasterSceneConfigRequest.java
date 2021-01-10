// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterSceneConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("ComponentId")
    public java.util.List<String> componentId;

    public static SetCasterSceneConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCasterSceneConfigRequest self = new SetCasterSceneConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetCasterSceneConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCasterSceneConfigRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public SetCasterSceneConfigRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public SetCasterSceneConfigRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public SetCasterSceneConfigRequest setComponentId(java.util.List<String> componentId) {
        this.componentId = componentId;
        return this;
    }
    public java.util.List<String> getComponentId() {
        return this.componentId;
    }

}
