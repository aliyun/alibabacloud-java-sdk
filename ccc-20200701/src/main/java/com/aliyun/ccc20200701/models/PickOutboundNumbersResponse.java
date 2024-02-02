// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class PickOutboundNumbersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PickOutboundNumbersResponseBody body;

    public static PickOutboundNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        PickOutboundNumbersResponse self = new PickOutboundNumbersResponse();
        return TeaModel.build(map, self);
    }

    public PickOutboundNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PickOutboundNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PickOutboundNumbersResponse setBody(PickOutboundNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public PickOutboundNumbersResponseBody getBody() {
        return this.body;
    }

}
