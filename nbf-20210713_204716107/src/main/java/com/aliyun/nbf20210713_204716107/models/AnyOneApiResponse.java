// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204716107.models;

import com.aliyun.tea.*;

public class AnyOneApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AnyOneApiResponseBody body;

    public static AnyOneApiResponse build(java.util.Map<String, ?> map) throws Exception {
        AnyOneApiResponse self = new AnyOneApiResponse();
        return TeaModel.build(map, self);
    }

    public AnyOneApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnyOneApiResponse setBody(AnyOneApiResponseBody body) {
        this.body = body;
        return this;
    }
    public AnyOneApiResponseBody getBody() {
        return this.body;
    }

}
