// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveSnapshotJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287666</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitLiveSnapshotJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveSnapshotJobResponseBody self = new SubmitLiveSnapshotJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitLiveSnapshotJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitLiveSnapshotJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
