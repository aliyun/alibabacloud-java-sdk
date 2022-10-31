// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamStateResponseBody body;

    public static DescribeLiveStreamStateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamStateResponse self = new DescribeLiveStreamStateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamStateResponse setBody(DescribeLiveStreamStateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamStateResponseBody getBody() {
        return this.body;
    }

}
