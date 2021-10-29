// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class TurnOffAutoResourceOptimizeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TurnOffAutoResourceOptimizeResponseBody body;

    public static TurnOffAutoResourceOptimizeResponse build(java.util.Map<String, ?> map) throws Exception {
        TurnOffAutoResourceOptimizeResponse self = new TurnOffAutoResourceOptimizeResponse();
        return TeaModel.build(map, self);
    }

    public TurnOffAutoResourceOptimizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TurnOffAutoResourceOptimizeResponse setBody(TurnOffAutoResourceOptimizeResponseBody body) {
        this.body = body;
        return this;
    }
    public TurnOffAutoResourceOptimizeResponseBody getBody() {
        return this.body;
    }

}
