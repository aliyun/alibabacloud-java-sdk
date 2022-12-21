// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class PauseDataCorrectSQLJobRequest extends TeaModel {
    // The ID of the SQL task. You can call the [GetDataCorrectTaskDetail](~~208481~~) and [ListDBTaskSQLJob](~~207049~~) operations to obtain the value of this parameter.
    // 
    // >  If the Type parameter is set to SINGLE, you must pass the value of the JobId parameter to confirm the ID of the SQL task that you want to rerun.
    @NameInMap("JobId")
    public Long jobId;

    // The ID of the data change ticket. You can call the [ListOrders](~~144643~~) operation to query the ID of the data change ticket.
    @NameInMap("OrderId")
    public Long orderId;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    // The type of the pause operation. Valid values:
    // 
    // *   ALL: pauses all SQL tasks.
    // *   SINGLE: pauses a single SQL task.
    @NameInMap("Type")
    public String type;

    public static PauseDataCorrectSQLJobRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseDataCorrectSQLJobRequest self = new PauseDataCorrectSQLJobRequest();
        return TeaModel.build(map, self);
    }

    public PauseDataCorrectSQLJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public PauseDataCorrectSQLJobRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public PauseDataCorrectSQLJobRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public PauseDataCorrectSQLJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
