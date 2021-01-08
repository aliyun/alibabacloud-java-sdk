// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListRuleTasksRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    public static ListRuleTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRuleTasksRequest self = new ListRuleTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListRuleTasksRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
