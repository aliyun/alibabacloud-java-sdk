// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class PutInstanceIdsToTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutInstanceIdsToTokenResponseBody body;

    public static PutInstanceIdsToTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        PutInstanceIdsToTokenResponse self = new PutInstanceIdsToTokenResponse();
        return TeaModel.build(map, self);
    }

    public PutInstanceIdsToTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutInstanceIdsToTokenResponse setBody(PutInstanceIdsToTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public PutInstanceIdsToTokenResponseBody getBody() {
        return this.body;
    }

}
