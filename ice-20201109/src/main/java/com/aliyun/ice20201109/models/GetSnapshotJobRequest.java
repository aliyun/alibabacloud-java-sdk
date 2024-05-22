// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSnapshotJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetSnapshotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotJobRequest self = new GetSnapshotJobRequest();
        return TeaModel.build(map, self);
    }

    public GetSnapshotJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
