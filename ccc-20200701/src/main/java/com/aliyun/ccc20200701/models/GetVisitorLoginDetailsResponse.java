// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetVisitorLoginDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVisitorLoginDetailsResponseBody body;

    public static GetVisitorLoginDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVisitorLoginDetailsResponse self = new GetVisitorLoginDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetVisitorLoginDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVisitorLoginDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVisitorLoginDetailsResponse setBody(GetVisitorLoginDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVisitorLoginDetailsResponseBody getBody() {
        return this.body;
    }

}
