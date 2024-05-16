// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQueryDefaultTemplatesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SceneId")
    public Integer sceneId;

    public static DsgQueryDefaultTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgQueryDefaultTemplatesRequest self = new DsgQueryDefaultTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DsgQueryDefaultTemplatesRequest setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Integer getSceneId() {
        return this.sceneId;
    }

}
