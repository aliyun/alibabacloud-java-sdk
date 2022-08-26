// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCensResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCensResponseBody body;

    public static DescribeCensResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCensResponse self = new DescribeCensResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCensResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCensResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCensResponse setBody(DescribeCensResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCensResponseBody getBody() {
        return this.body;
    }

}
