// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelservice20220614.models;

import com.aliyun.tea.*;

public class GetUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>image_label</p>
     */
    @NameInMap("SceneType")
    public String sceneType;

    public static GetUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserRequest self = new GetUserRequest();
        return TeaModel.build(map, self);
    }

    public GetUserRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

}
