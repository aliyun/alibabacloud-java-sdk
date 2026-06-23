// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RetryReportTaskResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("outRequestNo")
    public String outRequestNo;

    @NameInMap("retryAvailable")
    public Boolean retryAvailable;

    @NameInMap("retryCount")
    public Integer retryCount;

    @NameInMap("taskStatus")
    public String taskStatus;

    public static RetryReportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryReportTaskResponseBody self = new RetryReportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryReportTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RetryReportTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RetryReportTaskResponseBody setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public RetryReportTaskResponseBody setRetryAvailable(Boolean retryAvailable) {
        this.retryAvailable = retryAvailable;
        return this;
    }
    public Boolean getRetryAvailable() {
        return this.retryAvailable;
    }

    public RetryReportTaskResponseBody setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Integer getRetryCount() {
        return this.retryCount;
    }

    public RetryReportTaskResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
