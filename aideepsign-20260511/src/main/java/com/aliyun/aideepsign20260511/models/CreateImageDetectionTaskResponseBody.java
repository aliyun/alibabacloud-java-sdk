// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateImageDetectionTaskResponseBody extends TeaModel {
    /**
     * <p>The business error code. The value <code>OK</code> is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code. The value <code>200</code> is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The additional information. The value <code>success</code> is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The task ID. You can use this ID to call <code>GetImageDetectionTaskResult</code> to query the result.</p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateImageDetectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageDetectionTaskResponseBody self = new CreateImageDetectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageDetectionTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateImageDetectionTaskResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateImageDetectionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateImageDetectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageDetectionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateImageDetectionTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
