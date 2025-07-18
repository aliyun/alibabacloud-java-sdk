// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveStreamCountResponseBody body;

    public static DescribeLiveStreamCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamCountResponse self = new DescribeLiveStreamCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamCountResponse setBody(DescribeLiveStreamCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamCountResponseBody getBody() {
        return this.body;
    }

}
