// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ResumeLogstashTaskResponseBody extends TeaModel {
    /**
     * <p>The error code returned. If the API operation is successfully called, this parameter is not returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned. If the API operation is successfully called, this parameter is not returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the change task is resumed. Valid values:</p>
     * <br>
     * <p>*   true: The change task is resumed.</p>
     * <p>*   false: The change task fails to be resumed.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static ResumeLogstashTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeLogstashTaskResponseBody self = new ResumeLogstashTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeLogstashTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResumeLogstashTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResumeLogstashTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResumeLogstashTaskResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
