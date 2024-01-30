// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplicationResponseBody body;

    public static GetApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponse self = new GetApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationResponse setBody(GetApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationResponseBody getBody() {
        return this.body;
    }

}
