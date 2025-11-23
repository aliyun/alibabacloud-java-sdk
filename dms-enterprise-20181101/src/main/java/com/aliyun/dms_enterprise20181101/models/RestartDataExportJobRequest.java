// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RestartDataExportJobRequest extends TeaModel {
    /**
     * <p>The ID of the SQL result set export task. You can call the <a href="https://help.aliyun.com/document_detail/465911.html">GetDataExportOrderDetail</a> operation to obtain the value of this parameter. If you set this parameter to Null, no SQL result set export task is suspended.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1276****</p>
     */
    @NameInMap("JobId")
    public Long jobId;

    /**
     * <p>The ticket ID. You can call the <a href="https://help.aliyun.com/document_detail/144643.html">ListOrders</a> operation to obtain the ticket ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>420****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the ID of the tenant, go to the DMS console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static RestartDataExportJobRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDataExportJobRequest self = new RestartDataExportJobRequest();
        return TeaModel.build(map, self);
    }

    public RestartDataExportJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public RestartDataExportJobRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public RestartDataExportJobRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
