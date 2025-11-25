// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeCdnLinkageRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnLinkageRulesResponseBody body;

    public static DescribeCdnLinkageRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnLinkageRulesResponse self = new DescribeCdnLinkageRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnLinkageRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnLinkageRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnLinkageRulesResponse setBody(DescribeCdnLinkageRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnLinkageRulesResponseBody getBody() {
        return this.body;
    }

}
