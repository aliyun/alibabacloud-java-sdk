// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlgorithmDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlgorithmDetailsResponseBody body;

    public static GetAlgorithmDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDetailsResponse self = new GetAlgorithmDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlgorithmDetailsResponse setBody(GetAlgorithmDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmDetailsResponseBody getBody() {
        return this.body;
    }

}
