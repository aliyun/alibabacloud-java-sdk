// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSitePauseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSitePauseResponseBody body;

    public static GetSitePauseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSitePauseResponse self = new GetSitePauseResponse();
        return TeaModel.build(map, self);
    }

    public GetSitePauseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSitePauseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSitePauseResponse setBody(GetSitePauseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSitePauseResponseBody getBody() {
        return this.body;
    }

}
