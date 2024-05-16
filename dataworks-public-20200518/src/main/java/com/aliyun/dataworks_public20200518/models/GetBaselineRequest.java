// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineRequest self = new GetBaselineRequest();
        return TeaModel.build(map, self);
    }

    public GetBaselineRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

    public GetBaselineRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
