// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetProjectDetailRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectType")
    public Integer projectType;

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

    public GetProjectDetailRequest setProjectType(Integer projectType) {
        this.projectType = projectType;
        return this;
    }
    public Integer getProjectType() {
        return this.projectType;
    }

}
