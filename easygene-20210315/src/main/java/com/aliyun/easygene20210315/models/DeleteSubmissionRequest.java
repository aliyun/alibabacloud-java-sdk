// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteSubmissionRequest extends TeaModel {
    // 投递ID
    @NameInMap("SubmissionId")
    public String submissionId;

    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    public static DeleteSubmissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubmissionRequest self = new DeleteSubmissionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubmissionRequest setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

    public DeleteSubmissionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
