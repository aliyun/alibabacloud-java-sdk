// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetLoginDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLoginDetailsResponseBody body;

    public static GetLoginDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoginDetailsResponse self = new GetLoginDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetLoginDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLoginDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLoginDetailsResponse setBody(GetLoginDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLoginDetailsResponseBody getBody() {
        return this.body;
    }

}
