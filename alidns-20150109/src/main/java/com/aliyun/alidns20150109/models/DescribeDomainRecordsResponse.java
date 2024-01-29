// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainRecordsResponseBody body;

    public static DescribeDomainRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRecordsResponse self = new DescribeDomainRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainRecordsResponse setBody(DescribeDomainRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRecordsResponseBody getBody() {
        return this.body;
    }

}
