// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAudioProduceJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    public static SubmitAudioProduceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAudioProduceJobResponseBody self = new SubmitAudioProduceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAudioProduceJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitAudioProduceJobResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitAudioProduceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAudioProduceJobResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
