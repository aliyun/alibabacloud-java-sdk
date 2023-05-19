// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnFullDomainsBlockIPHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnFullDomainsBlockIPHistoryResponseBody body;

    public static DescribeDcdnFullDomainsBlockIPHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnFullDomainsBlockIPHistoryResponse self = new DescribeDcdnFullDomainsBlockIPHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnFullDomainsBlockIPHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnFullDomainsBlockIPHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnFullDomainsBlockIPHistoryResponse setBody(DescribeDcdnFullDomainsBlockIPHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnFullDomainsBlockIPHistoryResponseBody getBody() {
        return this.body;
    }

}
