// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SetAuthConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAuthConfigResponseBody body;

    public static SetAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAuthConfigResponse self = new SetAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetAuthConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAuthConfigResponse setBody(SetAuthConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAuthConfigResponseBody getBody() {
        return this.body;
    }

}
