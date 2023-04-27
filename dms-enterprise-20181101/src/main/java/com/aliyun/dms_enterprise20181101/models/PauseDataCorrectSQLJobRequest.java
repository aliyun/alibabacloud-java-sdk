// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class PauseDataCorrectSQLJobRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The operation that you want to perform. Set the value to **PauseDataCorrectSQLJob**.</p>
     */
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
