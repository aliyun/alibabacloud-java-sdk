// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RetrieveCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetrieveCallResponseBody body;

    public static RetrieveCallResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrieveCallResponse self = new RetrieveCallResponse();
        return TeaModel.build(map, self);
    }

    public RetrieveCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetrieveCallResponse setBody(RetrieveCallResponseBody body) {
        this.body = body;
        return this;
    }
    public RetrieveCallResponseBody getBody() {
        return this.body;
    }

}
