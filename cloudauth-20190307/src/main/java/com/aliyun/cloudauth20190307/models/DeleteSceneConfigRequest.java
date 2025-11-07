// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteSceneConfigRequest extends TeaModel {
    /**
     * <p>ID of the intent authentication configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>559</p>
     */
    @NameInMap("sceneConfigId")
    public Long sceneConfigId;

    public static DeleteSceneConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneConfigRequest self = new DeleteSceneConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSceneConfigRequest setSceneConfigId(Long sceneConfigId) {
        this.sceneConfigId = sceneConfigId;
        return this;
    }
    public Long getSceneConfigId() {
        return this.sceneConfigId;
    }

}
