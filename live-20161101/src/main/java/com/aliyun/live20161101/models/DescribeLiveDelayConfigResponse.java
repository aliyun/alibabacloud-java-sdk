// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDelayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDelayConfigResponseBody body;

    public static DescribeLiveDelayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDelayConfigResponse self = new DescribeLiveDelayConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDelayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDelayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDelayConfigResponse setBody(DescribeLiveDelayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDelayConfigResponseBody getBody() {
        return this.body;
    }

}
