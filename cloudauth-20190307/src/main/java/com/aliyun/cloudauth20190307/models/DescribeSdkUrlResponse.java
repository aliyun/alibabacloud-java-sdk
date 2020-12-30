// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeSdkUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSdkUrlResponseBody body;

    public static DescribeSdkUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdkUrlResponse self = new DescribeSdkUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSdkUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSdkUrlResponse setBody(DescribeSdkUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSdkUrlResponseBody getBody() {
        return this.body;
    }

}
