// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ReDoRoutineBuildRequest extends TeaModel {
    /**
     * <p>The ID of the ER build task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>156773519472872</p>
     */
    @NameInMap("RoutineBuildId")
    public Long routineBuildId;

    public static ReDoRoutineBuildRequest build(java.util.Map<String, ?> map) throws Exception {
        ReDoRoutineBuildRequest self = new ReDoRoutineBuildRequest();
        return TeaModel.build(map, self);
    }

    public ReDoRoutineBuildRequest setRoutineBuildId(Long routineBuildId) {
        this.routineBuildId = routineBuildId;
        return this;
    }
    public Long getRoutineBuildId() {
        return this.routineBuildId;
    }

}
