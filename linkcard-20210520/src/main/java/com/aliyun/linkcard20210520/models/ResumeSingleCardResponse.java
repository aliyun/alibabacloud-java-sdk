// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ResumeSingleCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeSingleCardResponseBody body;

    public static ResumeSingleCardResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeSingleCardResponse self = new ResumeSingleCardResponse();
        return TeaModel.build(map, self);
    }

    public ResumeSingleCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeSingleCardResponse setBody(ResumeSingleCardResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeSingleCardResponseBody getBody() {
        return this.body;
    }

}
