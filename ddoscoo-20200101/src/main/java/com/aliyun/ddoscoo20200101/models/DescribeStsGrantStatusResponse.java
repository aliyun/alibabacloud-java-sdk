// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeStsGrantStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStsGrantStatusResponseBody body;

    public static DescribeStsGrantStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStsGrantStatusResponse self = new DescribeStsGrantStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStsGrantStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStsGrantStatusResponse setBody(DescribeStsGrantStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStsGrantStatusResponseBody getBody() {
        return this.body;
    }

}
