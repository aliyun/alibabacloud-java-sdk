// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBImportTaskStatusResponseBody extends TeaModel {
    @NameInMap("DetailMessage")
    public String detailMessage;

    @NameInMap("FailedCount")
    public String failedCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("SuccessCount")
    public String successCount;

    public static QueryDBImportTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDBImportTaskStatusResponseBody self = new QueryDBImportTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDBImportTaskStatusResponseBody setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
        return this;
    }
    public String getDetailMessage() {
        return this.detailMessage;
    }

    public QueryDBImportTaskStatusResponseBody setFailedCount(String failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public String getFailedCount() {
        return this.failedCount;
    }

    public QueryDBImportTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDBImportTaskStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDBImportTaskStatusResponseBody setSuccessCount(String successCount) {
        this.successCount = successCount;
        return this;
    }
    public String getSuccessCount() {
        return this.successCount;
    }

}
