// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRangeResponseBody body;

    public static GetRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRangeResponse self = new GetRangeResponse();
        return TeaModel.build(map, self);
    }

    public GetRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRangeResponse setBody(GetRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRangeResponseBody getBody() {
        return this.body;
    }

}
