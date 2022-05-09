// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class DescribeSynchronousJobDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSynchronousJobDetailsResponseBody body;

    public static DescribeSynchronousJobDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronousJobDetailsResponse self = new DescribeSynchronousJobDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronousJobDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSynchronousJobDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSynchronousJobDetailsResponse setBody(DescribeSynchronousJobDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSynchronousJobDetailsResponseBody getBody() {
        return this.body;
    }

}
