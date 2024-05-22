// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveSnapshotJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetLiveSnapshotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveSnapshotJobRequest self = new GetLiveSnapshotJobRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveSnapshotJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
