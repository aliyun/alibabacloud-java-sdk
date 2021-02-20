// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeCertsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCertsResponseBody body;

    public static DescribeCertsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertsResponse self = new DescribeCertsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCertsResponse setBody(DescribeCertsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCertsResponseBody getBody() {
        return this.body;
    }

}
