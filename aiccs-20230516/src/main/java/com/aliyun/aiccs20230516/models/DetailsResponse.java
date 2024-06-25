// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class DetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetailsResponseBody body;

    public static DetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailsResponse self = new DetailsResponse();
        return TeaModel.build(map, self);
    }

    public DetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetailsResponse setBody(DetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetailsResponseBody getBody() {
        return this.body;
    }

}
