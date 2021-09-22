// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBRestoreTaskStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("FailedCount")
    public Long failedCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DetailMessage")
    public String detailMessage;

    @NameInMap("SuccessCount")
    public Long successCount;

    public static QueryDBRestoreTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDBRestoreTaskStatusResponseBody self = new QueryDBRestoreTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDBRestoreTaskStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDBRestoreTaskStatusResponseBody setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Long getFailedCount() {
        return this.failedCount;
    }

    public QueryDBRestoreTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDBRestoreTaskStatusResponseBody setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
        return this;
    }
    public String getDetailMessage() {
        return this.detailMessage;
    }

    public QueryDBRestoreTaskStatusResponseBody setSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }
    public Long getSuccessCount() {
        return this.successCount;
    }

}
