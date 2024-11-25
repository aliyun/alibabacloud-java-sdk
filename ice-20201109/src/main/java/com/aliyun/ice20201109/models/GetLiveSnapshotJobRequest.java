// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveSnapshotJobRequest extends TeaModel {
    /**
     * <p>The job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
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
