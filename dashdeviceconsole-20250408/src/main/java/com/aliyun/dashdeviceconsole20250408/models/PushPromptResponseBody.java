// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashdeviceconsole20250408.models;

import com.aliyun.tea.*;

public class PushPromptResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>True</p>
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
     * <p>5090DEE5-E7DB-59A8-B712-28918D3AAA8A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static PushPromptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushPromptResponseBody self = new PushPromptResponseBody();
        return TeaModel.build(map, self);
    }

    public PushPromptResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public PushPromptResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public PushPromptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PushPromptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushPromptResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
