// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTemplatesResponseBody body;

    public static GetTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplatesResponse self = new GetTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplatesResponse setBody(GetTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplatesResponseBody getBody() {
        return this.body;
    }

}
