// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeCdrIbDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkDescribeCdrIbDetailsResponseBody body;

    public static ClinkDescribeCdrIbDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeCdrIbDetailsResponse self = new ClinkDescribeCdrIbDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeCdrIbDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkDescribeCdrIbDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkDescribeCdrIbDetailsResponse setBody(ClinkDescribeCdrIbDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkDescribeCdrIbDetailsResponseBody getBody() {
        return this.body;
    }

}
