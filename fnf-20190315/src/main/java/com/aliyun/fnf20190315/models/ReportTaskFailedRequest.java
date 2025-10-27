// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ReportTaskFailedRequest extends TeaModel {
    /**
     * <p>The cause of the failure. The value must be 1 to 4,096 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>emptyString</p>
     */
    @NameInMap("Cause")
    public String cause;

    /**
     * <p>The error code for the failed task. The error code must be 1 to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nill</p>
     */
    @NameInMap("Error")
    public String error;

    /**
     * <p>The token of the task whose execution you want to report. The task token is passed to the called service, such as Message Service (MNS) or Function Compute. For MNS, the value of this parameter can be obtained from a message. For Function Compute, the value of this parameter can be obtained from an event. For more information, see <a href="https://help.aliyun.com/document_detail/2592915.html">Service integration modes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>emptyString</p>
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

    public ReportTaskFailedRequest setTaskToken(String taskToken) {
        this.taskToken = taskToken;
        return this;
    }
    public String getTaskToken() {
        return this.taskToken;
    }

}
