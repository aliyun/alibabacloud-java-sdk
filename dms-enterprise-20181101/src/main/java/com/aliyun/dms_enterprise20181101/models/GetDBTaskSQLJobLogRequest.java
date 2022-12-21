// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDBTaskSQLJobLogRequest extends TeaModel {
    // The ID of the SQL task. You can call the [ListDBTaskSQLJob](~~207049~~) operation to query the ID of the SQL task.
    @NameInMap("JobId")
    public Long jobId;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
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
