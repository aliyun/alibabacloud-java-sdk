// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ReportTaskFailedRequest extends TeaModel {
    /**
     * <p>The cause of the failure. The value must be 1 to 4,096 characters in length.</p>
     */
    @NameInMap("Cause")
    public String cause;

    /**
     * <p>The error code for the failed task. The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <p>The request ID. If you specify this parameter, the system uses this value as the ID of the request. If you do not specify this parameter, the system generates a value at random.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The token of the specified task that you want to report. If this parameter appears in **waitforCallback** mode, the parameter is passed to the called service, such as Message Service (MNS) or Function Compute. For MNS, the value of this parameter can be obtained from a message. For Function Compute, the value of this parameter can be obtained from an event.</p>
     */
    @NameInMap("TaskToken")
    public String taskToken;

    public static ReportTaskFailedRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportTaskFailedRequest self = new ReportTaskFailedRequest();
        return TeaModel.build(map, self);
    }

    public ReportTaskFailedRequest setCause(String cause) {
        this.cause = cause;
        return this;
    }
    public String getCause() {
        return this.cause;
    }

    public ReportTaskFailedRequest setError(String error) {
        this.error = error;
        return this;
    }
    public String getError() {
        return this.error;
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

}
