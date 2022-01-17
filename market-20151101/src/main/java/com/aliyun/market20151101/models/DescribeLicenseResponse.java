// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLicenseResponseBody body;

    public static DescribeLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLicenseResponse self = new DescribeLicenseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLicenseResponse setBody(DescribeLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLicenseResponseBody getBody() {
        return this.body;
    }

}
