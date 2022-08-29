// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccProjectModelsRequest extends TeaModel {
    @NameInMap("JobName")
    public String jobName;

    @NameInMap("Mode")
    public Integer mode;

    @NameInMap("ProjectId")
    public Long projectId;

    public static ListCsccProjectModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCsccProjectModelsRequest self = new ListCsccProjectModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListCsccProjectModelsRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListCsccProjectModelsRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public ListCsccProjectModelsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
