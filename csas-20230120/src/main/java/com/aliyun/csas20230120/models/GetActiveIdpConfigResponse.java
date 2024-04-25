// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetActiveIdpConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetActiveIdpConfigResponseBody body;

    public static GetActiveIdpConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetActiveIdpConfigResponse self = new GetActiveIdpConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetActiveIdpConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetActiveIdpConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetActiveIdpConfigResponse setBody(GetActiveIdpConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetActiveIdpConfigResponseBody getBody() {
        return this.body;
    }

}
