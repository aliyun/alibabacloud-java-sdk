// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSitePairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSitePairResponseBody body;

    public static DescribeSitePairResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSitePairResponse self = new DescribeSitePairResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSitePairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSitePairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSitePairResponse setBody(DescribeSitePairResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSitePairResponseBody getBody() {
        return this.body;
    }

}
