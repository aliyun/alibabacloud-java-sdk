// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetProjectDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetProjectDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectDetailRequest self = new GetProjectDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectDetailRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
