// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class StopRoutineBuildRequest extends TeaModel {
    /**
     * <p>The ID of the ER build task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4195751945250944</p>
     */
    @NameInMap("RoutineBuildId")
    public Long routineBuildId;

    public static StopRoutineBuildRequest build(java.util.Map<String, ?> map) throws Exception {
        StopRoutineBuildRequest self = new StopRoutineBuildRequest();
        return TeaModel.build(map, self);
    }

    public StopRoutineBuildRequest setRoutineBuildId(Long routineBuildId) {
        this.routineBuildId = routineBuildId;
        return this;
    }
    public Long getRoutineBuildId() {
        return this.routineBuildId;
    }

}
