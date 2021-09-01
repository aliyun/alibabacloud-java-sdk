// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class CreateCorpInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCorpInfoResponseBody body;

    public static CreateCorpInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCorpInfoResponse self = new CreateCorpInfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateCorpInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCorpInfoResponse setBody(CreateCorpInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCorpInfoResponseBody getBody() {
        return this.body;
    }

}
