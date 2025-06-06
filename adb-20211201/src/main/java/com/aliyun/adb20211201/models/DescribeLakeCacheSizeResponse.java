// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeLakeCacheSizeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLakeCacheSizeResponseBody body;

    public static DescribeLakeCacheSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakeCacheSizeResponse self = new DescribeLakeCacheSizeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLakeCacheSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLakeCacheSizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLakeCacheSizeResponse setBody(DescribeLakeCacheSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLakeCacheSizeResponseBody getBody() {
        return this.body;
    }

}
