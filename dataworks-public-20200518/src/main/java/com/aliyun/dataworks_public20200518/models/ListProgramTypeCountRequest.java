// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProgramTypeCountRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("ProjectEnv")
    @Validation(required = true)
    public String projectEnv;

    public static ListProgramTypeCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProgramTypeCountRequest self = new ListProgramTypeCountRequest();
        return TeaModel.build(map, self);
    }

    public ListProgramTypeCountRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListProgramTypeCountRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
