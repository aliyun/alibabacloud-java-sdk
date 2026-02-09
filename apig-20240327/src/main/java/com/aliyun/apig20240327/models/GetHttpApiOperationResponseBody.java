// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHttpApiOperationResponseBody extends TeaModel {
    /**
     * <p>Response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The operation information.</p>
     */
    @NameInMap("data")
    public HttpApiOperationInfo data;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B725275B-50C6-5A49-A9FD-F0332FCB3351</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetHttpApiOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHttpApiOperationResponseBody self = new GetHttpApiOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHttpApiOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHttpApiOperationResponseBody setData(HttpApiOperationInfo data) {
        this.data = data;
        return this;
    }
    public HttpApiOperationInfo getData() {
        return this.data;
    }

    public GetHttpApiOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHttpApiOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
