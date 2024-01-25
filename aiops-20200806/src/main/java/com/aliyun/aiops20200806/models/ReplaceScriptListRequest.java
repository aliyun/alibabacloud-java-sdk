// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ReplaceScriptListRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("Type")
    public Integer type;

    public static ReplaceScriptListRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceScriptListRequest self = new ReplaceScriptListRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceScriptListRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public ReplaceScriptListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public ReplaceScriptListRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ReplaceScriptListRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
