// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHttpApiResponseBody extends TeaModel {
    /**
     * <p>Response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The API information.</p>
     */
    @NameInMap("data")
    public HttpApiApiInfo data;

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
     * <p>8FA9BB94-915B-5299-A694-49FCC7F5DD00</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetHttpApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHttpApiResponseBody self = new GetHttpApiResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHttpApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHttpApiResponseBody setData(HttpApiApiInfo data) {
        this.data = data;
        return this;
    }
    public HttpApiApiInfo getData() {
        return this.data;
    }

    public GetHttpApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHttpApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
