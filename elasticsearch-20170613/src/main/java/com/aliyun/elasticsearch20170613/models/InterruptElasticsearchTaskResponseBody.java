// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InterruptElasticsearchTaskResponseBody extends TeaModel {
    /**
     * <p>The error code. Only displayed if an exception is returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message. Only displayed if an exception is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <br>
     * <p>*   true: interrupted change successfully</p>
     * <p>*   false: interrupted change failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static InterruptElasticsearchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InterruptElasticsearchTaskResponseBody self = new InterruptElasticsearchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public InterruptElasticsearchTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InterruptElasticsearchTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InterruptElasticsearchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InterruptElasticsearchTaskResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
