// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class RebindResumeSingleCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebindResumeSingleCardResponseBody body;

    public static RebindResumeSingleCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RebindResumeSingleCardResponse self = new RebindResumeSingleCardResponse();
        return TeaModel.build(map, self);
    }

    public RebindResumeSingleCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebindResumeSingleCardResponse setBody(RebindResumeSingleCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RebindResumeSingleCardResponseBody getBody() {
        return this.body;
    }

}
