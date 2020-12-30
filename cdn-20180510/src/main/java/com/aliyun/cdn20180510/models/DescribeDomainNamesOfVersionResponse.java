// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainNamesOfVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainNamesOfVersionResponseBody body;

    public static DescribeDomainNamesOfVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainNamesOfVersionResponse self = new DescribeDomainNamesOfVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainNamesOfVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainNamesOfVersionResponse setBody(DescribeDomainNamesOfVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainNamesOfVersionResponseBody getBody() {
        return this.body;
    }

}
