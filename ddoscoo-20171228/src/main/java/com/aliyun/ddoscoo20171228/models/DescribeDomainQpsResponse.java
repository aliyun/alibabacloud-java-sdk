// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainQpsResponseBody body;

    public static DescribeDomainQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsResponse self = new DescribeDomainQpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainQpsResponse setBody(DescribeDomainQpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainQpsResponseBody getBody() {
        return this.body;
    }

}
