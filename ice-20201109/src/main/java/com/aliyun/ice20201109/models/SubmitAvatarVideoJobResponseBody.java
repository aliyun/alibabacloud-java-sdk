// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAvatarVideoJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAvatarVideoJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAvatarVideoJobResponseBody self = new SubmitAvatarVideoJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAvatarVideoJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitAvatarVideoJobResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAvatarVideoJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
