// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ExecuteOperationASyncResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. A value of 200 indicates that the request is successful, and other values indicate that the request fails.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The ID of the operation.</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, String> data;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteOperationASyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteOperationASyncResponseBody self = new ExecuteOperationASyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteOperationASyncResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExecuteOperationASyncResponseBody setData(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, String> getData() {
        return this.data;
    }

    public ExecuteOperationASyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteOperationASyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
