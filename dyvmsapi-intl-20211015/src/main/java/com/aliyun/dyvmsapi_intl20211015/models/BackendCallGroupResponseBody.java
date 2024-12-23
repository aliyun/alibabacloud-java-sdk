// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class BackendCallGroupResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <p>The value OK indicates that the request was successful. Other values indicate that the request failed. For more information, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E50FFA85-0B79-4421-A7BD-00B0A271966F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID. You can use this ID to query the details of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
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
