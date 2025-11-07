// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateSceneConfigRequest extends TeaModel {
    /**
     * <p>Scene configuration information, in JSON format. For the specific structure definition, please refer to more information about the configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;faceCompareMode\&quot;:\&quot;AUTHORITY\&quot;,\&quot;certConfigs\&quot;:[{\&quot;index\&quot;:0,\&quot;model\&quot;:\&quot;ENROLL\&quot;}],\&quot;screenEvidence\&quot;:false}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>Willingness configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>607</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Selected authentication scene.</p>
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
