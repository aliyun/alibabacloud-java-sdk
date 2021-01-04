// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeCnameAutoStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCnameAutoStatusResponseBody body;

    public static DescribeCnameAutoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCnameAutoStatusResponse self = new DescribeCnameAutoStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCnameAutoStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCnameAutoStatusResponse setBody(DescribeCnameAutoStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCnameAutoStatusResponseBody getBody() {
        return this.body;
    }

}
