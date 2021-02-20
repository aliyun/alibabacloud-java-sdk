// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeDNSMapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDNSMapResponseBody body;

    public static DescribeDNSMapResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDNSMapResponse self = new DescribeDNSMapResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDNSMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDNSMapResponse setBody(DescribeDNSMapResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDNSMapResponseBody getBody() {
        return this.body;
    }

}
