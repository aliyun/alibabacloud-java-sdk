// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgSceneQuerySceneListByNameRequest extends TeaModel {
    /**
     * <p>The keyword for a fuzzy search of data masking scenario names.</p>
     * 
     * <strong>example:</strong>
     * <p>dev_</p>
     */
    @NameInMap("SceneName")
    public String sceneName;

    public static DsgSceneQuerySceneListByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgSceneQuerySceneListByNameRequest self = new DsgSceneQuerySceneListByNameRequest();
        return TeaModel.build(map, self);
    }

    public DsgSceneQuerySceneListByNameRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

}
