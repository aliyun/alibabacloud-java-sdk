// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanDeleteShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public String idsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    public static DsgDesensPlanDeleteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanDeleteShrinkRequest self = new DsgDesensPlanDeleteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanDeleteShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public DsgDesensPlanDeleteShrinkRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
