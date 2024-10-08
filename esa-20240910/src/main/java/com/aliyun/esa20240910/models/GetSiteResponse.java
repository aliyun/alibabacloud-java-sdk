// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSiteResponseBody body;

    public static GetSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSiteResponse self = new GetSiteResponse();
        return TeaModel.build(map, self);
    }

    public GetSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSiteResponse setBody(GetSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSiteResponseBody getBody() {
        return this.body;
    }

}
