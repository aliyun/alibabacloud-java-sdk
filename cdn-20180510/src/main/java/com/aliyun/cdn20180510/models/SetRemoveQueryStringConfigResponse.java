// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetRemoveQueryStringConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetRemoveQueryStringConfigResponseBody body;

    public static SetRemoveQueryStringConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRemoveQueryStringConfigResponse self = new SetRemoveQueryStringConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetRemoveQueryStringConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRemoveQueryStringConfigResponse setBody(SetRemoveQueryStringConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRemoveQueryStringConfigResponseBody getBody() {
        return this.body;
    }

}
