// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class BackendCallGroupResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>The value OK indicates that the request was successful. Other values indicate that the request failed. For more information, see Error codes.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID. You can use this ID to query the details of the task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static BackendCallGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BackendCallGroupResponseBody self = new BackendCallGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public BackendCallGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BackendCallGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BackendCallGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BackendCallGroupResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
