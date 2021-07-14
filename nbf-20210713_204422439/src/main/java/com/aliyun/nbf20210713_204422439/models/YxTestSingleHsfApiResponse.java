// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204422439.models;

import com.aliyun.tea.*;

public class YxTestSingleHsfApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public YxTestSingleHsfApiResponseBody body;

    public static YxTestSingleHsfApiResponse build(java.util.Map<String, ?> map) throws Exception {
        YxTestSingleHsfApiResponse self = new YxTestSingleHsfApiResponse();
        return TeaModel.build(map, self);
    }

    public YxTestSingleHsfApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public YxTestSingleHsfApiResponse setBody(YxTestSingleHsfApiResponseBody body) {
        this.body = body;
        return this;
    }
    public YxTestSingleHsfApiResponseBody getBody() {
        return this.body;
    }

}
