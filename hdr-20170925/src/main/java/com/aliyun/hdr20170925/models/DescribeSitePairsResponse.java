// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSitePairsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSitePairsResponseBody body;

    public static DescribeSitePairsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSitePairsResponse self = new DescribeSitePairsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSitePairsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSitePairsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSitePairsResponse setBody(DescribeSitePairsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSitePairsResponseBody getBody() {
        return this.body;
    }

}
