// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainLogResponseBody body;

    public static DescribeLiveDomainLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainLogResponse self = new DescribeLiveDomainLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainLogResponse setBody(DescribeLiveDomainLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainLogResponseBody getBody() {
        return this.body;
    }

}
