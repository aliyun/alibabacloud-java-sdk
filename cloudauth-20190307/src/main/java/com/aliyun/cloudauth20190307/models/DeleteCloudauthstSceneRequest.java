// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteCloudauthstSceneRequest extends TeaModel {
    /**
     * <p>ID of the scene to be deleted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4275001</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static DeleteCloudauthstSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudauthstSceneRequest self = new DeleteCloudauthstSceneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloudauthstSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
