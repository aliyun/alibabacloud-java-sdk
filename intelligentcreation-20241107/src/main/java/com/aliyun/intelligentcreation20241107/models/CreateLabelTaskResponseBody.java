// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20241107.models;

import com.aliyun.tea.*;

public class CreateLabelTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PARAM_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>56AC346B-AF40-5E4F-AFFE-FD8BA5E6FB3A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>829682927337963520</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static CreateLabelTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelTaskResponseBody self = new CreateLabelTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLabelTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateLabelTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLabelTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLabelTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLabelTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
