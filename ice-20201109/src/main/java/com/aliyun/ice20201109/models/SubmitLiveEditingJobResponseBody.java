// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveEditingJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaURL")
    public String mediaURL;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VodMediaId")
    public String vodMediaId;

    public static SubmitLiveEditingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveEditingJobResponseBody self = new SubmitLiveEditingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitLiveEditingJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitLiveEditingJobResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitLiveEditingJobResponseBody setMediaURL(String mediaURL) {
        this.mediaURL = mediaURL;
        return this;
    }
    public String getMediaURL() {
        return this.mediaURL;
    }

    public SubmitLiveEditingJobResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitLiveEditingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitLiveEditingJobResponseBody setVodMediaId(String vodMediaId) {
        this.vodMediaId = vodMediaId;
        return this;
    }
    public String getVodMediaId() {
        return this.vodMediaId;
    }

}
