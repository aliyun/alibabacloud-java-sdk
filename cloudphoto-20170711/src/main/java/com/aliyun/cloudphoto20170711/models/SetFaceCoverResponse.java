// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class SetFaceCoverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetFaceCoverResponseBody body;

    public static SetFaceCoverResponse build(java.util.Map<String, ?> map) throws Exception {
        SetFaceCoverResponse self = new SetFaceCoverResponse();
        return TeaModel.build(map, self);
    }

    public SetFaceCoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetFaceCoverResponse setBody(SetFaceCoverResponseBody body) {
        this.body = body;
        return this;
    }
    public SetFaceCoverResponseBody getBody() {
        return this.body;
    }

}
