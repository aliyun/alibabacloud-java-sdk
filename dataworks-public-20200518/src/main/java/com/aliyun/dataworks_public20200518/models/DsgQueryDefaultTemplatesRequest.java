// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQueryDefaultTemplatesRequest extends TeaModel {
    /**
     * <p>The ID of the level-2 data masking scenario. You can call the <a href="https://help.aliyun.com/document_detail/2786322.html">DsgSceneQuerySceneListByName</a> operation to query the list of IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
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
