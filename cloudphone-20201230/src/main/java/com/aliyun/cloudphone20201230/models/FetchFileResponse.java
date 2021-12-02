// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class FetchFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FetchFileResponseBody body;

    public static FetchFileResponse build(java.util.Map<String, ?> map) throws Exception {
        FetchFileResponse self = new FetchFileResponse();
        return TeaModel.build(map, self);
    }

    public FetchFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FetchFileResponse setBody(FetchFileResponseBody body) {
        this.body = body;
        return this;
    }
    public FetchFileResponseBody getBody() {
        return this.body;
    }

}
