// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaProducingJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 剪辑工程Id
    @NameInMap("ProjectId")
    public String projectId;

    // 合成作业Id
    @NameInMap("JobId")
    public String jobId;

    // 合成媒资Id
    @NameInMap("MediaId")
    public String mediaId;

    public static SubmitMediaProducingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaProducingJobResponseBody self = new SubmitMediaProducingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitMediaProducingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitMediaProducingJobResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitMediaProducingJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitMediaProducingJobResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
