// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateDeploymentJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the deployment task.</p>
     * 
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDeploymentJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentJobResponseBody self = new CreateDeploymentJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentJobResponseBody setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public CreateDeploymentJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
