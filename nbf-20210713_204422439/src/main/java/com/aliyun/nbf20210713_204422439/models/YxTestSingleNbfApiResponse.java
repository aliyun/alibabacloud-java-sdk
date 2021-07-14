// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210713_204422439.models;

import com.aliyun.tea.*;

public class YxTestSingleNbfApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public YxTestSingleNbfApiResponseBody body;

    public static YxTestSingleNbfApiResponse build(java.util.Map<String, ?> map) throws Exception {
        YxTestSingleNbfApiResponse self = new YxTestSingleNbfApiResponse();
        return TeaModel.build(map, self);
    }

    public YxTestSingleNbfApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public YxTestSingleNbfApiResponse setBody(YxTestSingleNbfApiResponseBody body) {
        this.body = body;
        return this;
    }
    public YxTestSingleNbfApiResponseBody getBody() {
        return this.body;
    }

}
