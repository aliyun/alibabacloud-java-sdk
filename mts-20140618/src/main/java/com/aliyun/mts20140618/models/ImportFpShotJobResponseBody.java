// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ImportFpShotJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the import job. We recommend that you save this ID for subsequent operations.</p>
     * 
     * <strong>example:</strong>
     * <p>c074b118ace44395a02063a5ab94****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImportFpShotJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportFpShotJobResponseBody self = new ImportFpShotJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportFpShotJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ImportFpShotJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
