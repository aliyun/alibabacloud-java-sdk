// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaProducingJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>c469e944b5a856828dc2</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>b4549d46c88681030f6e</strong></strong></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>d8s4h75ci975745c14b</strong></strong></p>
     */
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
