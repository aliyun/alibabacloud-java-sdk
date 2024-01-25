// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddSceneListRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("SceneDescribe")
    public String sceneDescribe;

    @NameInMap("SceneName")
    public String sceneName;

    @NameInMap("ScenePersonLiable")
    public String scenePersonLiable;

    @NameInMap("SceneType")
    public String sceneType;

    @NameInMap("SceneVoJson")
    public String sceneVoJson;

    @NameInMap("Webhook")
    public String webhook;

    public static AddSceneListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSceneListRequest self = new AddSceneListRequest();
        return TeaModel.build(map, self);
    }

    public AddSceneListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public AddSceneListRequest setSceneDescribe(String sceneDescribe) {
        this.sceneDescribe = sceneDescribe;
        return this;
    }
    public String getSceneDescribe() {
        return this.sceneDescribe;
    }

    public AddSceneListRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public AddSceneListRequest setScenePersonLiable(String scenePersonLiable) {
        this.scenePersonLiable = scenePersonLiable;
        return this;
    }
    public String getScenePersonLiable() {
        return this.scenePersonLiable;
    }

    public AddSceneListRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public AddSceneListRequest setSceneVoJson(String sceneVoJson) {
        this.sceneVoJson = sceneVoJson;
        return this;
    }
    public String getSceneVoJson() {
        return this.sceneVoJson;
    }

    public AddSceneListRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

}
