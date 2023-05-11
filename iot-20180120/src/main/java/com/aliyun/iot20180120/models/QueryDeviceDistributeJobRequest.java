// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDistributeJobRequest extends TeaModel {
    /**
     * <p>The ID of the distribution task. The ID globally identifies the task.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static QueryDeviceDistributeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDistributeJobRequest self = new QueryDeviceDistributeJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDistributeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
