// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackMaxQpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainAttackMaxQpsResponseBody body;

    public static DescribeDomainAttackMaxQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackMaxQpsResponse self = new DescribeDomainAttackMaxQpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackMaxQpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainAttackMaxQpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainAttackMaxQpsResponse setBody(DescribeDomainAttackMaxQpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainAttackMaxQpsResponseBody getBody() {
        return this.body;
    }

}
