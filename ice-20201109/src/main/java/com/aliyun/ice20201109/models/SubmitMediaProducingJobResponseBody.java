// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaProducingJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VodMediaId")
    public String vodMediaId;

    public static SubmitMediaProducingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaProducingJobResponseBody self = new SubmitMediaProducingJobResponseBody();
        return TeaModel.build(map, self);
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

    public SubmitMediaProducingJobResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitMediaProducingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitMediaProducingJobResponseBody setVodMediaId(String vodMediaId) {
        this.vodMediaId = vodMediaId;
        return this;
    }
    public String getVodMediaId() {
        return this.vodMediaId;
    }

}
