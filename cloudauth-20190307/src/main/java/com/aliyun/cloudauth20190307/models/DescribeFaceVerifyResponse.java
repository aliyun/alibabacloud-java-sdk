// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFaceVerifyResponseBody body;

    public static DescribeFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceVerifyResponse self = new DescribeFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaceVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFaceVerifyResponse setBody(DescribeFaceVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFaceVerifyResponseBody getBody() {
        return this.body;
    }

}
