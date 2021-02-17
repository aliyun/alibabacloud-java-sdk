// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DeleteImageJobRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("JobId")
    public String jobId;

    public static DeleteImageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageJobRequest self = new DeleteImageJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageJobRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DeleteImageJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DeleteImageJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
