// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class ExecuteSceneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a84a55aa410e460a9ac753570c76fecc</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static ExecuteSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSceneRequest self = new ExecuteSceneRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
