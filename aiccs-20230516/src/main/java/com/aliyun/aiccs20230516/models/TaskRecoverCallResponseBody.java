// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskRecoverCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.Map<String, ?> model;

    /**
     * <strong>example:</strong>
     * <p>8EFC6D10-307B-1ECA-A8C6-7CBDF776AAD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>1683440860035</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static TaskRecoverCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaskRecoverCallResponseBody self = new TaskRecoverCallResponseBody();
        return TeaModel.build(map, self);
    }

    public TaskRecoverCallResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public TaskRecoverCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskRecoverCallResponseBody setModel(java.util.Map<String, ?> model) {
        this.model = model;
        return this;
    }
    public java.util.Map<String, ?> getModel() {
        return this.model;
    }

    public TaskRecoverCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaskRecoverCallResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public TaskRecoverCallResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
