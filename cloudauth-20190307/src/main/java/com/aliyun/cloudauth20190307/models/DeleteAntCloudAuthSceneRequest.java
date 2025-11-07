// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteAntCloudAuthSceneRequest extends TeaModel {
    /**
     * <p>ID of the scene to be deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000011589</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    public static DeleteAntCloudAuthSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntCloudAuthSceneRequest self = new DeleteAntCloudAuthSceneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAntCloudAuthSceneRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
