// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetAppConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppConfigResponseBody body;

    public static GetAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppConfigResponse self = new GetAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAppConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppConfigResponse setBody(GetAppConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppConfigResponseBody getBody() {
        return this.body;
    }

}
