// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SubmitQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitQueryResponseBody body;

    public static SubmitQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitQueryResponse self = new SubmitQueryResponse();
        return TeaModel.build(map, self);
    }

    public SubmitQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitQueryResponse setBody(SubmitQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitQueryResponseBody getBody() {
        return this.body;
    }

}
