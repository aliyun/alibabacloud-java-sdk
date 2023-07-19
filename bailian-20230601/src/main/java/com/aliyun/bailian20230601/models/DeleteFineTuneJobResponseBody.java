// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DeleteFineTuneJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFineTuneJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFineTuneJobResponseBody self = new DeleteFineTuneJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFineTuneJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DeleteFineTuneJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
