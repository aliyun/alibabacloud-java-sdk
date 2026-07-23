// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineBuildRequest extends TeaModel {
    /**
     * <p>The ID of the ER build task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4354306271619136</p>
     */
    @NameInMap("RoutineBuildId")
    public Long routineBuildId;

    public static GetRoutineBuildRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineBuildRequest self = new GetRoutineBuildRequest();
        return TeaModel.build(map, self);
    }

    public GetRoutineBuildRequest setRoutineBuildId(Long routineBuildId) {
        this.routineBuildId = routineBuildId;
        return this;
    }
    public Long getRoutineBuildId() {
        return this.routineBuildId;
    }

}
