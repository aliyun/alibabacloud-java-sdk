// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitVideoGifJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobId")
    public String jobId;

    public static SubmitVideoGifJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoGifJobResponseBody self = new SubmitVideoGifJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoGifJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitVideoGifJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
