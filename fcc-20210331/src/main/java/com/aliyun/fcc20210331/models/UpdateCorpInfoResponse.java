// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateCorpInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCorpInfoResponseBody body;

    public static UpdateCorpInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCorpInfoResponse self = new UpdateCorpInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCorpInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCorpInfoResponse setBody(UpdateCorpInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCorpInfoResponseBody getBody() {
        return this.body;
    }

}
