// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCcActivityLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainCcActivityLogResponseBody body;

    public static DescribeDomainCcActivityLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCcActivityLogResponse self = new DescribeDomainCcActivityLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCcActivityLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainCcActivityLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainCcActivityLogResponse setBody(DescribeDomainCcActivityLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainCcActivityLogResponseBody getBody() {
        return this.body;
    }

}
