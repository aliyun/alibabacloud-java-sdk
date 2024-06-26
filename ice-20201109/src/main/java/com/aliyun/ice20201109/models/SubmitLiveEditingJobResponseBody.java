// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveEditingJobResponseBody extends TeaModel {
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
     * <p><a href="http://test-bucket.cn-shanghai.aliyuncs.com/test.mp4">http://test-bucket.cn-shanghai.aliyuncs.com/test.mp4</a></p>
     */
    @NameInMap("MediaURL")
    public String mediaURL;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
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
     * <p><strong><strong>d7578s4h75ci945c14b</strong></strong></p>
     */
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
