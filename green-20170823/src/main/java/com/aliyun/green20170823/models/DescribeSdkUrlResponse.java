// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeSdkUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSdkUrlResponseBody body;

    public static DescribeSdkUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdkUrlResponse self = new DescribeSdkUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSdkUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSdkUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSdkUrlResponse setBody(DescribeSdkUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSdkUrlResponseBody getBody() {
        return this.body;
    }

}
