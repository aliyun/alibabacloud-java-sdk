// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteSceneRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("SceneId")
    public Long sceneId;

    public static DeleteSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneRequest self = new DeleteSceneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSceneRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DeleteSceneRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
