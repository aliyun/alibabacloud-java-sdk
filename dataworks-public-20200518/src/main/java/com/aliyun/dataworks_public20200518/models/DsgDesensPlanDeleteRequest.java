// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanDeleteRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Integer> ids;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    public static DsgDesensPlanDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanDeleteRequest self = new DsgDesensPlanDeleteRequest();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanDeleteRequest setIds(java.util.List<Integer> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Integer> getIds() {
        return this.ids;
    }

    public DsgDesensPlanDeleteRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
