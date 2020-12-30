// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetImageNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetImageNameResponseBody body;

    public static SetImageNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SetImageNameResponse self = new SetImageNameResponse();
        return TeaModel.build(map, self);
    }

    public SetImageNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetImageNameResponse setBody(SetImageNameResponseBody body) {
        this.body = body;
        return this;
    }
    public SetImageNameResponseBody getBody() {
        return this.body;
    }

}
