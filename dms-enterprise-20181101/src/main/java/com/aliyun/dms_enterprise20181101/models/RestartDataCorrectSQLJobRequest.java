// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RestartDataCorrectSQLJobRequest extends TeaModel {
    /**
     * <p>The ID of the SQL task. You can call the <a href="https://help.aliyun.com/document_detail/208481.html">GetDataCorrectTaskDetail</a> and <a href="https://help.aliyun.com/document_detail/207049.html">ListDBTaskSQLJob</a> operations to obtain the value of this parameter.</p>
     * <p>If the Type parameter is set to SINGLE, you must pass the value of the JobId parameter to confirm the ID of the SQL task that you want to rerun.</p>
     * 
     * <strong>example:</strong>
     * <p>43253</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The ID of the data change ticket. You can call the <a href="https://help.aliyun.com/document_detail/144643.html">ListOrders</a> operation to query the ID of the data change ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>453****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The type of the rerun operation. Valid values:</p>
     * <ul>
     * <li><strong>ALL</strong>: reruns all SQL tasks.</li>
     * <li><strong>SINGLE</strong>: reruns a single SQL task.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
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
