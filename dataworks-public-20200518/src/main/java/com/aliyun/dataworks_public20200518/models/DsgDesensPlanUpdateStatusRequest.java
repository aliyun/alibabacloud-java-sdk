// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanUpdateStatusRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DsgDesensPlanUpdateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanUpdateStatusRequest self = new DsgDesensPlanUpdateStatusRequest();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanUpdateStatusRequest setIds(java.util.List<Integer> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Integer> getIds() {
        return this.ids;
    }

    public DsgDesensPlanUpdateStatusRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public DsgDesensPlanUpdateStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
