// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultCountResponseBody extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FailedCount")
    public Integer failedCount;

    @NameInMap("SuccessCount")
    public Integer successCount;

    @NameInMap("BatchType")
    public String batchType;

    @NameInMap("Reason")
    public String reason;

    public static DescribeBatchResultCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultCountResponseBody self = new DescribeBatchResultCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBatchResultCountResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeBatchResultCountResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeBatchResultCountResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DescribeBatchResultCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBatchResultCountResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public DescribeBatchResultCountResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public DescribeBatchResultCountResponseBody setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public DescribeBatchResultCountResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
