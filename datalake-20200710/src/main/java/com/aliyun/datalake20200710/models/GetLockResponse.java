// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetLockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLockResponseBody body;

    public static GetLockResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLockResponse self = new GetLockResponse();
        return TeaModel.build(map, self);
    }

    public GetLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLockResponse setBody(GetLockResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLockResponseBody getBody() {
        return this.body;
    }

}
