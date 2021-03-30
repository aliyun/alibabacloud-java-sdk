// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SetApNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetApNameResponseBody body;

    public static SetApNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SetApNameResponse self = new SetApNameResponse();
        return TeaModel.build(map, self);
    }

    public SetApNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetApNameResponse setBody(SetApNameResponseBody body) {
        this.body = body;
        return this;
    }
    public SetApNameResponseBody getBody() {
        return this.body;
    }

}
