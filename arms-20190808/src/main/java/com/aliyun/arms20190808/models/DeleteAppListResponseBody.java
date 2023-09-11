// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAppListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. 2XX indicates that the request was successful. 3XX indicates that the request was redirected. 4XX indicates that a request error occurred. 5XX indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error message returned when the request parameters are invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the specified applications are deleted. Valid values:</p>
     * <br>
     * <p>*   `true`: The applications are deleted.</p>
     * <p>*   `false`: The applications failed to be deleted.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAppListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppListResponseBody self = new DeleteAppListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DeleteAppListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteAppListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAppListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAppListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
