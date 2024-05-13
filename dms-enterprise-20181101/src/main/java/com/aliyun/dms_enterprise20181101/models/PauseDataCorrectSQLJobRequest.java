// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class PauseDataCorrectSQLJobRequest extends TeaModel {
    /**
     * <p>The ID of the SQL task. You can call the [GetDataCorrectTaskDetail](https://help.aliyun.com/document_detail/208481.html) or [ListDBTaskSQLJob](https://help.aliyun.com/document_detail/207049.html) operation to obtain the value of this parameter.</p>
     * <br>
     * <p>>  If Type is set to SINGLE, you must pass in the value of JobId to confirm the ID of the SQL task that you want to pause.</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The ID of the data change ticket. You can call the [ListOrders](https://help.aliyun.com/document_detail/144643.html) operation to query the ID of the data change ticket.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The tenant ID. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The type of the pause operation. Valid values:</p>
     * <br>
     * <p>*   ALL: pauses all SQL tasks.</p>
     * <p>*   SINGLE: pauses a single SQL task.</p>
     * <br>
     * <p>This parameter is required.</p>
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
