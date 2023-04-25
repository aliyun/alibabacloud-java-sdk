// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainQpsListResponseBody body;

    public static DescribeDomainQpsListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsListResponse self = new DescribeDomainQpsListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainQpsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainQpsListResponse setBody(DescribeDomainQpsListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainQpsListResponseBody getBody() {
        return this.body;
    }

}
