// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeCdrObDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkDescribeCdrObDetailsResponseBody body;

    public static ClinkDescribeCdrObDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeCdrObDetailsResponse self = new ClinkDescribeCdrObDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeCdrObDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkDescribeCdrObDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkDescribeCdrObDetailsResponse setBody(ClinkDescribeCdrObDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkDescribeCdrObDetailsResponseBody getBody() {
        return this.body;
    }

}
