// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProgramTypeCountRequest extends TeaModel {
    /**
     * <p>The environment of the workspace, including projects in PROD and DEV.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListProgramTypeCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProgramTypeCountRequest self = new ListProgramTypeCountRequest();
        return TeaModel.build(map, self);
    }

    public ListProgramTypeCountRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListProgramTypeCountRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
