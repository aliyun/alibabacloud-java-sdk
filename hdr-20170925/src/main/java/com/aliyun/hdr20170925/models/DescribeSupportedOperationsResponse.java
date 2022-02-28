// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSupportedOperationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSupportedOperationsResponseBody body;

    public static DescribeSupportedOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedOperationsResponse self = new DescribeSupportedOperationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupportedOperationsResponse setBody(DescribeSupportedOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupportedOperationsResponseBody getBody() {
        return this.body;
    }

}
