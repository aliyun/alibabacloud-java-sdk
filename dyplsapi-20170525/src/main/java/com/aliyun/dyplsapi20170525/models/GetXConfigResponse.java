// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetXConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetXConfigResponseBody body;

    public static GetXConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetXConfigResponse self = new GetXConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetXConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetXConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetXConfigResponse setBody(GetXConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetXConfigResponseBody getBody() {
        return this.body;
    }

}
