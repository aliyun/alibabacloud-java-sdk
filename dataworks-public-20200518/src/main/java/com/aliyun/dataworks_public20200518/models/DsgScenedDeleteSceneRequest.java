// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgScenedDeleteSceneRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Integer> ids;

    public static DsgScenedDeleteSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgScenedDeleteSceneRequest self = new DsgScenedDeleteSceneRequest();
        return TeaModel.build(map, self);
    }

    public DsgScenedDeleteSceneRequest setIds(java.util.List<Integer> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Integer> getIds() {
        return this.ids;
    }

}
