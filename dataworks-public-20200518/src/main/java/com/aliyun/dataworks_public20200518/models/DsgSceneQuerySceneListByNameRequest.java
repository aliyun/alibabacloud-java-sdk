// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgSceneQuerySceneListByNameRequest extends TeaModel {
    /**
     * <p>The name of the data masking scenario. A fuzzy match is performed in the platform based on a keyword to search for the data masking scenario.</p>
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
