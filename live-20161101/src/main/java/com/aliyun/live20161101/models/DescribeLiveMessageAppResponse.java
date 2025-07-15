// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveMessageAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveMessageAppResponseBody body;

    public static DescribeLiveMessageAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveMessageAppResponse self = new DescribeLiveMessageAppResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveMessageAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveMessageAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveMessageAppResponse setBody(DescribeLiveMessageAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveMessageAppResponseBody getBody() {
        return this.body;
    }

}
