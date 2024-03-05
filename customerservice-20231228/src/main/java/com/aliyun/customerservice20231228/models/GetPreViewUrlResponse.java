// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class GetPreViewUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPreViewUrlResponseBody body;

    public static GetPreViewUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPreViewUrlResponse self = new GetPreViewUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetPreViewUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPreViewUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPreViewUrlResponse setBody(GetPreViewUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPreViewUrlResponseBody getBody() {
        return this.body;
    }

}
