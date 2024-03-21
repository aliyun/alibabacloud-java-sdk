// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCcActivityLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainCcActivityLogResponseBody body;

    public static DescribeDcdnDomainCcActivityLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainCcActivityLogResponse self = new DescribeDcdnDomainCcActivityLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainCcActivityLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainCcActivityLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainCcActivityLogResponse setBody(DescribeDcdnDomainCcActivityLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainCcActivityLogResponseBody getBody() {
        return this.body;
    }

}
