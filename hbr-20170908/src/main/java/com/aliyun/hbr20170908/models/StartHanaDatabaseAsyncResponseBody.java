// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class StartHanaDatabaseAsyncResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the job that is used to initialize the backup vault. You can call the DescribeTask operation to query the status of the job.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StartHanaDatabaseAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartHanaDatabaseAsyncResponseBody self = new StartHanaDatabaseAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public StartHanaDatabaseAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartHanaDatabaseAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartHanaDatabaseAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartHanaDatabaseAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartHanaDatabaseAsyncResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
