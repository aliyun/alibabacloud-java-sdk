// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeShareUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRetcodeShareUrlResponseBody body;

    public static GetRetcodeShareUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeShareUrlResponse self = new GetRetcodeShareUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetRetcodeShareUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRetcodeShareUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRetcodeShareUrlResponse setBody(GetRetcodeShareUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRetcodeShareUrlResponseBody getBody() {
        return this.body;
    }

}
