// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultCountResponseBody extends TeaModel {
    /**
     * <p>The type of the batch operation.</p>
     * 
     * <strong>example:</strong>
     * <p>DOMAIN_ADD</p>
     */
    @NameInMap("BatchType")
    public String batchType;

    /**
     * <p>The total number of domain names or DNS records that failed to be processed.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FailedCount")
    public Integer failedCount;

    /**
     * <p>The cause of the execution failure.</p>
     * 
     * <strong>example:</strong>
     * <p>failed_reason</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75446CC1-FC9A-4595-8D96-089D73D7A63D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the task. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: No task for importing domain names or DNS records is submitted.</li>
     * <li><strong>0</strong>: The task is being processed.</li>
     * <li><strong>1</strong>: The task is complete.</li>
     * <li><strong>2</strong>: The task failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The total number of domain names or DNS records that were processed.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    /**
     * <p>The ID of the last task.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The total number of DNS records that were processed in batches.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBatchResultCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultCountResponseBody self = new DescribeBatchResultCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBatchResultCountResponseBody setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public DescribeBatchResultCountResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public DescribeBatchResultCountResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public DescribeBatchResultCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBatchResultCountResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeBatchResultCountResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public DescribeBatchResultCountResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DescribeBatchResultCountResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
