// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnsecServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnsecServiceResponseBody body;

    public static DescribeDcdnsecServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnsecServiceResponse self = new DescribeDcdnsecServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnsecServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnsecServiceResponse setBody(DescribeDcdnsecServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnsecServiceResponseBody getBody() {
        return this.body;
    }

}
