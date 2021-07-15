// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210715_103740905.models;

import com.aliyun.tea.*;

public class YxTestSingleApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public YxTestSingleApiResponseBody body;

    public static YxTestSingleApiResponse build(java.util.Map<String, ?> map) throws Exception {
        YxTestSingleApiResponse self = new YxTestSingleApiResponse();
        return TeaModel.build(map, self);
    }

    public YxTestSingleApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public YxTestSingleApiResponse setBody(YxTestSingleApiResponseBody body) {
        this.body = body;
        return this;
    }
    public YxTestSingleApiResponseBody getBody() {
        return this.body;
    }

}
