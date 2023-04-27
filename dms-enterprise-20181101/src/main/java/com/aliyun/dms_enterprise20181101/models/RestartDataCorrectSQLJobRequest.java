// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RestartDataCorrectSQLJobRequest extends TeaModel {
    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The ID of the SQL task. You can call the [GetDataCorrectTaskDetail](~~208481~~) and [ListDBTaskSQLJob](~~207049~~) operations to obtain the value of this parameter.</p>
     * <br>
     * <p>If the Type parameter is set to SINGLE, you must pass the value of the JobId parameter to confirm the ID of the SQL task that you want to rerun.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.</p>
     */
    @NameInMap("Type")
    public String type;

    public static RestartDataCorrectSQLJobRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDataCorrectSQLJobRequest self = new RestartDataCorrectSQLJobRequest();
        return TeaModel.build(map, self);
    }

    public RestartDataCorrectSQLJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public RestartDataCorrectSQLJobRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public RestartDataCorrectSQLJobRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public RestartDataCorrectSQLJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
