// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AgreeMemberAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AgreeMemberAccessResponseBody body;

    public static AgreeMemberAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        AgreeMemberAccessResponse self = new AgreeMemberAccessResponse();
        return TeaModel.build(map, self);
    }

    public AgreeMemberAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AgreeMemberAccessResponse setBody(AgreeMemberAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public AgreeMemberAccessResponseBody getBody() {
        return this.body;
    }

}
