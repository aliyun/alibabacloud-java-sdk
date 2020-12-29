// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DescribeDVOrderResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDVOrderResultResponseBody body;

    public static DescribeDVOrderResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDVOrderResultResponse self = new DescribeDVOrderResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDVOrderResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDVOrderResultResponse setBody(DescribeDVOrderResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDVOrderResultResponseBody getBody() {
        return this.body;
    }

}
