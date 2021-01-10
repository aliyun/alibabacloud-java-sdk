// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveVerifyContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveVerifyContentResponseBody body;

    public static DescribeLiveVerifyContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveVerifyContentResponse self = new DescribeLiveVerifyContentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveVerifyContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveVerifyContentResponse setBody(DescribeLiveVerifyContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveVerifyContentResponseBody getBody() {
        return this.body;
    }

}
