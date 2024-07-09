// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnFullDomainsBlockIPHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnFullDomainsBlockIPHistoryResponseBody body;

    public static DescribeCdnFullDomainsBlockIPHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnFullDomainsBlockIPHistoryResponse self = new DescribeCdnFullDomainsBlockIPHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnFullDomainsBlockIPHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnFullDomainsBlockIPHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnFullDomainsBlockIPHistoryResponse setBody(DescribeCdnFullDomainsBlockIPHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnFullDomainsBlockIPHistoryResponseBody getBody() {
        return this.body;
    }

}
