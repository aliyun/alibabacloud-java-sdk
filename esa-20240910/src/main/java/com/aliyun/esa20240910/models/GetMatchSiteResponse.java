// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetMatchSiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMatchSiteResponseBody body;

    public static GetMatchSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMatchSiteResponse self = new GetMatchSiteResponse();
        return TeaModel.build(map, self);
    }

    public GetMatchSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMatchSiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMatchSiteResponse setBody(GetMatchSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMatchSiteResponseBody getBody() {
        return this.body;
    }

}
