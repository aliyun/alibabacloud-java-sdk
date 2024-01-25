// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateSceneRequest extends TeaModel {
    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("MetricListJson")
    public String metricListJson;

    @NameInMap("NodeListJson")
    public String nodeListJson;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("SceneDesc")
    public String sceneDesc;

    @NameInMap("SceneName")
    public String sceneName;

    @NameInMap("SceneOwner")
    public String sceneOwner;

    @NameInMap("SceneWebhook")
    public String sceneWebhook;

    public static CreateSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneRequest self = new CreateSceneRequest();
        return TeaModel.build(map, self);
    }

    public CreateSceneRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateSceneRequest setMetricListJson(String metricListJson) {
        this.metricListJson = metricListJson;
        return this;
    }
    public String getMetricListJson() {
        return this.metricListJson;
    }

    public CreateSceneRequest setNodeListJson(String nodeListJson) {
        this.nodeListJson = nodeListJson;
        return this;
    }
    public String getNodeListJson() {
        return this.nodeListJson;
    }

    public CreateSceneRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public CreateSceneRequest setSceneDesc(String sceneDesc) {
        this.sceneDesc = sceneDesc;
        return this;
    }
    public String getSceneDesc() {
        return this.sceneDesc;
    }

    public CreateSceneRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public CreateSceneRequest setSceneOwner(String sceneOwner) {
        this.sceneOwner = sceneOwner;
        return this;
    }
    public String getSceneOwner() {
        return this.sceneOwner;
    }

    public CreateSceneRequest setSceneWebhook(String sceneWebhook) {
        this.sceneWebhook = sceneWebhook;
        return this;
    }
    public String getSceneWebhook() {
        return this.sceneWebhook;
    }

}
