// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainPublishErrorCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainPublishErrorCodeResponseBody body;

    public static DescribeLiveDomainPublishErrorCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainPublishErrorCodeResponse self = new DescribeLiveDomainPublishErrorCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainPublishErrorCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainPublishErrorCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainPublishErrorCodeResponse setBody(DescribeLiveDomainPublishErrorCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainPublishErrorCodeResponseBody getBody() {
        return this.body;
    }

}
