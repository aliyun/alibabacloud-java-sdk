// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeListAntCloudAuthScenesRequest extends TeaModel {
    /**
     * <p>Scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100000xxxx</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    public static DescribeListAntCloudAuthScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeListAntCloudAuthScenesRequest self = new DescribeListAntCloudAuthScenesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeListAntCloudAuthScenesRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
