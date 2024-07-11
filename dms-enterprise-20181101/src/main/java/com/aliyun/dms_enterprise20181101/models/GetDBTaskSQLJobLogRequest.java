// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDBTaskSQLJobLogRequest extends TeaModel {
    /**
     * <p>The ID of the SQL task. You can call the <a href="https://help.aliyun.com/document_detail/207049.html">ListDBTaskSQLJob</a> operation to query the ID of the SQL task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1276****</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
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
