// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteCircuitBreakerRulesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The IDs of the rules that were deleted.</p>
     */
    @NameInMap("Data")
    public java.util.List<Long> data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteCircuitBreakerRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCircuitBreakerRulesResponseBody self = new DeleteCircuitBreakerRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCircuitBreakerRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteCircuitBreakerRulesResponseBody setData(java.util.List<Long> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Long> getData() {
        return this.data;
    }

    public DeleteCircuitBreakerRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteCircuitBreakerRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteCircuitBreakerRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCircuitBreakerRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
