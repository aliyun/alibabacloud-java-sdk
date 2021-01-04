// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ReportTaskFailedRequest extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskToken")
    public String taskToken;

    @NameInMap("Error")
    public String error;

    @NameInMap("Cause")
    public String cause;

    public static ReportTaskFailedRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportTaskFailedRequest self = new ReportTaskFailedRequest();
        return TeaModel.build(map, self);
    }

    public ReportTaskFailedRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReportTaskFailedRequest setTaskToken(String taskToken) {
        this.taskToken = taskToken;
        return this;
    }
    public String getTaskToken() {
        return this.taskToken;
    }

    public ReportTaskFailedRequest setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
    }

    public ReportTaskFailedRequest setCause(String cause) {
        this.cause = cause;
        return this;
    }
    public String getCause() {
        return this.cause;
    }

}
