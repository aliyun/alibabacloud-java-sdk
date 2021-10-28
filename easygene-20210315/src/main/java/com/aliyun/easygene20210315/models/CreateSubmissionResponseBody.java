// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateSubmissionResponseBody extends TeaModel {
    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 投递ID
    @NameInMap("SubmissionId")
    public String submissionId;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static CreateSubmissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubmissionResponseBody self = new CreateSubmissionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubmissionResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public CreateSubmissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSubmissionResponseBody setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

    public CreateSubmissionResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
