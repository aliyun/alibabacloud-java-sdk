// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetClusterDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterDetailsResponseBody body;

    public static GetClusterDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDetailsResponse self = new GetClusterDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterDetailsResponse setBody(GetClusterDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterDetailsResponseBody getBody() {
        return this.body;
    }

}
