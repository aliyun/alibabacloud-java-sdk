// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultCountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Status")
    @Validation(required = true)
    public Integer status;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("SuccessCount")
    @Validation(required = true)
    public Integer successCount;

    @NameInMap("FailedCount")
    @Validation(required = true)
    public Integer failedCount;

    @NameInMap("Reason")
    @Validation(required = true)
    public String reason;

    @NameInMap("BatchType")
    @Validation(required = true)
    public String batchType;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    public static DescribeBatchResultCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultCountResponse self = new DescribeBatchResultCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBatchResultCountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBatchResultCountResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeBatchResultCountResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeBatchResultCountResponse setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public DescribeBatchResultCountResponse setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public DescribeBatchResultCountResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public DescribeBatchResultCountResponse setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public DescribeBatchResultCountResponse setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
