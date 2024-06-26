// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitPackageJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2d705f385b704ee5b*******a36d93e0</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>31E30781-9495-5E2D-A84D-759B0A01E262</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitPackageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitPackageJobResponseBody self = new SubmitPackageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitPackageJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitPackageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
