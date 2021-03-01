// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RestartApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartApplicationResponseBody body;

    public static RestartApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartApplicationResponse self = new RestartApplicationResponse();
        return TeaModel.build(map, self);
    }

    public RestartApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartApplicationResponse setBody(RestartApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartApplicationResponseBody getBody() {
        return this.body;
    }

}
