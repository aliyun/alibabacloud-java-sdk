// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ResumeSubmissionRequest extends TeaModel {
    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    // 投递ID
    @NameInMap("SubmissionId")
    public String submissionId;

    public static ResumeSubmissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeSubmissionRequest self = new ResumeSubmissionRequest();
        return TeaModel.build(map, self);
    }

    public ResumeSubmissionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ResumeSubmissionRequest setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

}
