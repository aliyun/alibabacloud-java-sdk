// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CancelJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>d1ce4d3efcb549419193f50f1fcd****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>338CA33A-AE83-5DF4-B6F2-C6D3ED8143F5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelJobResponseBody self = new CancelJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CancelJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
