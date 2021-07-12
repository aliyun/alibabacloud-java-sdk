// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210709_163152377.models;

import com.aliyun.tea.*;

public class ChenjingtestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChenjingtestResponseBody body;

    public static ChenjingtestResponse build(java.util.Map<String, ?> map) throws Exception {
        ChenjingtestResponse self = new ChenjingtestResponse();
        return TeaModel.build(map, self);
    }

    public ChenjingtestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChenjingtestResponse setBody(ChenjingtestResponseBody body) {
        this.body = body;
        return this;
    }
    public ChenjingtestResponseBody getBody() {
        return this.body;
    }

}
