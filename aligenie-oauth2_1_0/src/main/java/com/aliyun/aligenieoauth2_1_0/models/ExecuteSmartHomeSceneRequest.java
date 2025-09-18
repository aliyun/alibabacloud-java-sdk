// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class ExecuteSmartHomeSceneRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2iS1AH5eo8qrw1PYBL/Ulq==</p>
     */
    @NameInMap("FamilyId")
    public String familyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Y1lCALepjYmTEouxsTrkjB==</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static ExecuteSmartHomeSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSmartHomeSceneRequest self = new ExecuteSmartHomeSceneRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteSmartHomeSceneRequest setFamilyId(String familyId) {
        this.familyId = familyId;
        return this;
    }
    public String getFamilyId() {
        return this.familyId;
    }

    public ExecuteSmartHomeSceneRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
