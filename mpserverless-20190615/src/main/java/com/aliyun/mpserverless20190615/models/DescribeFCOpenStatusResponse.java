// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeFCOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFCOpenStatusResponseBody body;

    public static DescribeFCOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFCOpenStatusResponse self = new DescribeFCOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFCOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFCOpenStatusResponse setBody(DescribeFCOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFCOpenStatusResponseBody getBody() {
        return this.body;
    }

}
