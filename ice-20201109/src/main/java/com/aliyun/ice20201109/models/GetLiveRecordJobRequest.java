// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveRecordJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetLiveRecordJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRecordJobRequest self = new GetLiveRecordJobRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveRecordJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
