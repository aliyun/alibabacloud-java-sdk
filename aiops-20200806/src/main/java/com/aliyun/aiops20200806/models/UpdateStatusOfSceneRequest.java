// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateStatusOfSceneRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("SceneStatus")
    public Integer sceneStatus;

    public static UpdateStatusOfSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStatusOfSceneRequest self = new UpdateStatusOfSceneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStatusOfSceneRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public UpdateStatusOfSceneRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public UpdateStatusOfSceneRequest setSceneStatus(Integer sceneStatus) {
        this.sceneStatus = sceneStatus;
        return this;
    }
    public Integer getSceneStatus() {
        return this.sceneStatus;
    }

}
