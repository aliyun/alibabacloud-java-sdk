// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetProxyAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProxyAccessResponseBody body;

    public static GetProxyAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProxyAccessResponse self = new GetProxyAccessResponse();
        return TeaModel.build(map, self);
    }

    public GetProxyAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProxyAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProxyAccessResponse setBody(GetProxyAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProxyAccessResponseBody getBody() {
        return this.body;
    }

}
