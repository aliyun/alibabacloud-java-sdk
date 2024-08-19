// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssCheckStatusResponseBody body;

    public static GetOssCheckStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckStatusResponse self = new GetOssCheckStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetOssCheckStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssCheckStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssCheckStatusResponse setBody(GetOssCheckStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssCheckStatusResponseBody getBody() {
        return this.body;
    }

}
