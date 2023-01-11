// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetProxyByTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProxyByTypeResponseBody body;

    public static GetProxyByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProxyByTypeResponse self = new GetProxyByTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetProxyByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProxyByTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProxyByTypeResponse setBody(GetProxyByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProxyByTypeResponseBody getBody() {
        return this.body;
    }

}
