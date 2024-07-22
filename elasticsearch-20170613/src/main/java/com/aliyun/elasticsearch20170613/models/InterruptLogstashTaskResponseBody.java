// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InterruptLogstashTaskResponseBody extends TeaModel {
    /**
     * <p>The error code returned. If the API operation is successfully called, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned. If the API operation is successfully called, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0FA05123-745C-42FD-A69B-AFF48EF9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the task is suspended. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static InterruptLogstashTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InterruptLogstashTaskResponseBody self = new InterruptLogstashTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public InterruptLogstashTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InterruptLogstashTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InterruptLogstashTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InterruptLogstashTaskResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
