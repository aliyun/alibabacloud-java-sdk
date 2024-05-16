// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgSceneAddOrUpdateSceneShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("scenes")
    public String scenesShrink;

    public static DsgSceneAddOrUpdateSceneShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgSceneAddOrUpdateSceneShrinkRequest self = new DsgSceneAddOrUpdateSceneShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DsgSceneAddOrUpdateSceneShrinkRequest setScenesShrink(String scenesShrink) {
        this.scenesShrink = scenesShrink;
        return this;
    }
    public String getScenesShrink() {
        return this.scenesShrink;
    }

}
