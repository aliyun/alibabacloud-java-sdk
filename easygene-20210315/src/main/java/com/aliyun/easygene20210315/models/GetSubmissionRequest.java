// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetSubmissionRequest extends TeaModel {
    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    // 投递ID
    @NameInMap("SubmissionId")
    public String submissionId;

    public static GetSubmissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubmissionRequest self = new GetSubmissionRequest();
        return TeaModel.build(map, self);
    }

    public GetSubmissionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public GetSubmissionRequest setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

}
