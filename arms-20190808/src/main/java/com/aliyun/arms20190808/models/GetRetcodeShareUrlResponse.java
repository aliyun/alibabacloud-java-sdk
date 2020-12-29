// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeShareUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetRetcodeShareUrlResponse setBody(GetRetcodeShareUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRetcodeShareUrlResponseBody getBody() {
        return this.body;
    }

}
