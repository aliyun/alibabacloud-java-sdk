// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeTotalStatInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTotalStatInfoResponseBody body;

    public static DescribeTotalStatInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTotalStatInfoResponse self = new DescribeTotalStatInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTotalStatInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTotalStatInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTotalStatInfoResponse setBody(DescribeTotalStatInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTotalStatInfoResponseBody getBody() {
        return this.body;
    }

}
