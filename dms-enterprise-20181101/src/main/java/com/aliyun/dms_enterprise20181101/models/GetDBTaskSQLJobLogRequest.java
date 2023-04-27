// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDBTaskSQLJobLogRequest extends TeaModel {
    /**
     * <p>The log that records the scheduling details.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDBTaskSQLJobLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDBTaskSQLJobLogRequest self = new GetDBTaskSQLJobLogRequest();
        return TeaModel.build(map, self);
    }

    public GetDBTaskSQLJobLogRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public GetDBTaskSQLJobLogRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
