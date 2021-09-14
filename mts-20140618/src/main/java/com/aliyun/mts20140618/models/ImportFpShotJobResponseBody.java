// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ImportFpShotJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobId")
    public String jobId;

    public static ImportFpShotJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportFpShotJobResponseBody self = new ImportFpShotJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportFpShotJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportFpShotJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
