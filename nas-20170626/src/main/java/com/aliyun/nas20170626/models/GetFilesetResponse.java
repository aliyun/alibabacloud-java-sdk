// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetFilesetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFilesetResponseBody body;

    public static GetFilesetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFilesetResponse self = new GetFilesetResponse();
        return TeaModel.build(map, self);
    }

    public GetFilesetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFilesetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFilesetResponse setBody(GetFilesetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFilesetResponseBody getBody() {
        return this.body;
    }

}
