// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateSceneConfigRequest extends TeaModel {
    /**
     * <p>The willingness authentication configuration, in JSON string format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;faceCompareMode\&quot;:\&quot;AUTHORITY\&quot;,\&quot;certConfigs\&quot;:[{\&quot;index\&quot;:0,\&quot;openVoiceCompare\&quot;:true,\&quot;openCustomizedContent\&quot;:true,\&quot;model\&quot;:\&quot;FOLLOW\&quot;}],\&quot;screenEvidence\&quot;:false}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000014084</p>
     */
    @NameInMap("sceneId")
    public Long sceneId;

    /**
     * <p>The configuration type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VOLUNTARY</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateSceneConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneConfigRequest self = new CreateSceneConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateSceneConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateSceneConfigRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public CreateSceneConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
