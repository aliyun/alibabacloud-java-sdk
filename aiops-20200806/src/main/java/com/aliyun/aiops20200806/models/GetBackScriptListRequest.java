// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBackScriptListRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("SceneId")
    public Integer sceneId;

    public static GetBackScriptListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBackScriptListRequest self = new GetBackScriptListRequest();
        return TeaModel.build(map, self);
    }

    public GetBackScriptListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetBackScriptListRequest setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Integer getSceneId() {
        return this.sceneId;
    }

}
