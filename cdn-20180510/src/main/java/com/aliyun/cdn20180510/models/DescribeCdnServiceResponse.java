// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCdnServiceResponseBody body;

    public static DescribeCdnServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnServiceResponse self = new DescribeCdnServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnServiceResponse setBody(DescribeCdnServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnServiceResponseBody getBody() {
        return this.body;
    }

}
