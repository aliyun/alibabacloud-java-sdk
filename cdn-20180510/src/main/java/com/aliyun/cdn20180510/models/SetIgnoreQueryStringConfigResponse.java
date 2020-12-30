// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetIgnoreQueryStringConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetIgnoreQueryStringConfigResponseBody body;

    public static SetIgnoreQueryStringConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetIgnoreQueryStringConfigResponse self = new SetIgnoreQueryStringConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetIgnoreQueryStringConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetIgnoreQueryStringConfigResponse setBody(SetIgnoreQueryStringConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetIgnoreQueryStringConfigResponseBody getBody() {
        return this.body;
    }

}
