// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateSceneConfigRequest extends TeaModel {
    /**
     * <p>The scenario configuration in JSON format. For the specific structure definition, refer to the additional information about configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;faceCompareMode\&quot;:\&quot;AUTHORITY\&quot;,\&quot;certConfigs\&quot;:[{\&quot;index\&quot;:0,\&quot;model\&quot;:\&quot;ENROLL\&quot;}],\&quot;screenEvidence\&quot;:false}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The ID of the intent configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>607</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The selected verification scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000012918</p>
     */
    @NameInMap("sceneId")
    public Long sceneId;

    public static UpdateSceneConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneConfigRequest self = new UpdateSceneConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSceneConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateSceneConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSceneConfigRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
