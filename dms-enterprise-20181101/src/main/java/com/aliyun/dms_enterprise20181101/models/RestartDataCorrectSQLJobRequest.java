// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RestartDataCorrectSQLJobRequest extends TeaModel {
    /**
     * <p>The ID of the SQL task. You can call the [GetDataCorrectTaskDetail](https://help.aliyun.com/document_detail/208481.html) and [ListDBTaskSQLJob](https://help.aliyun.com/document_detail/207049.html) operations to obtain the value of this parameter.</p>
     * <br>
     * <p>If the Type parameter is set to SINGLE, you must pass the value of the JobId parameter to confirm the ID of the SQL task that you want to rerun.</p>
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
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The type of the rerun operation. Valid values:</p>
     * <br>
     * <p>*   **ALL**: reruns all SQL tasks.</p>
     * <p>*   **SINGLE**: reruns a single SQL task.</p>
     * <br>
     * <p>This parameter is required.</p>
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
