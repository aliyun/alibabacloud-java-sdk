// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateCorpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCorpResponseBody body;

    public static UpdateCorpResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCorpResponse self = new UpdateCorpResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCorpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCorpResponse setBody(UpdateCorpResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCorpResponseBody getBody() {
        return this.body;
    }

}
