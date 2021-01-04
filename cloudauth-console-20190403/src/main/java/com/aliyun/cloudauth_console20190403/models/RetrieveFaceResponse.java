// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190403.models;

import com.aliyun.tea.*;

public class RetrieveFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetrieveFaceResponseBody body;

    public static RetrieveFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrieveFaceResponse self = new RetrieveFaceResponse();
        return TeaModel.build(map, self);
    }

    public RetrieveFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetrieveFaceResponse setBody(RetrieveFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public RetrieveFaceResponseBody getBody() {
        return this.body;
    }

}
