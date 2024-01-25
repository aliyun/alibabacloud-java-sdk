// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeSceneDetailRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("SceneId")
    public Long sceneId;

    public static DescribeSceneDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneDetailRequest self = new DescribeSceneDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSceneDetailRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeSceneDetailRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
