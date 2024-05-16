// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanUpdateStatusShrinkRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DsgDesensPlanUpdateStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanUpdateStatusShrinkRequest self = new DsgDesensPlanUpdateStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanUpdateStatusShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public DsgDesensPlanUpdateStatusShrinkRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public DsgDesensPlanUpdateStatusShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
