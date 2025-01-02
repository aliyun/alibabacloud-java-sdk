// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHttpApiRouteResponseBody extends TeaModel {
    /**
     * <p>Response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Route detail data.</p>
     */
    @NameInMap("data")
    public HttpRoute data;

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
     * <p>3ACFC7A7-45A9-58CF-B2D5-765B60254695</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetHttpApiRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHttpApiRouteResponseBody self = new GetHttpApiRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHttpApiRouteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHttpApiRouteResponseBody setData(HttpRoute data) {
        this.data = data;
        return this;
    }
    public HttpRoute getData() {
        return this.data;
    }

    public GetHttpApiRouteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHttpApiRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
