// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSceneMediaSelectionJobResponseBody extends TeaModel {
    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong><strong>ACB-44F2-5F2D-88D7-1283E70</strong></strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSceneMediaSelectionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSceneMediaSelectionJobResponseBody self = new SubmitSceneMediaSelectionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSceneMediaSelectionJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitSceneMediaSelectionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
