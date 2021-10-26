// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AbolishApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AbolishApiResponseBody body;

    public static AbolishApiResponse build(java.util.Map<String, ?> map) throws Exception {
        AbolishApiResponse self = new AbolishApiResponse();
        return TeaModel.build(map, self);
    }

    public AbolishApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbolishApiResponse setBody(AbolishApiResponseBody body) {
        this.body = body;
        return this;
    }
    public AbolishApiResponseBody getBody() {
        return this.body;
    }

}
