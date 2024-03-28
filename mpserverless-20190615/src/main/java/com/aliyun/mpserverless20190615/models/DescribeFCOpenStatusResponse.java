// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeFCOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFCOpenStatusResponseBody body;

    public static DescribeFCOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFCOpenStatusResponse self = new DescribeFCOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFCOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFCOpenStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFCOpenStatusResponse setBody(DescribeFCOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFCOpenStatusResponseBody getBody() {
        return this.body;
    }

}
