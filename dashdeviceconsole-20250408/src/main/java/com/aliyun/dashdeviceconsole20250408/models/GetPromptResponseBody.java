// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashdeviceconsole20250408.models;

import com.aliyun.tea.*;

public class GetPromptResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{$PromptContent}</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BDA59622-2114-5F68-A530-3FCACAF0F04F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("statusCode")
    public Integer statusCode;

    public static GetPromptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPromptResponseBody self = new GetPromptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPromptResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public GetPromptResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPromptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPromptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPromptResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
