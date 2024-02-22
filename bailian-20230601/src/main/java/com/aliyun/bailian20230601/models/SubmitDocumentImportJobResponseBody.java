// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class SubmitDocumentImportJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitDocumentImportJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentImportJobResponseBody self = new SubmitDocumentImportJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentImportJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitDocumentImportJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
