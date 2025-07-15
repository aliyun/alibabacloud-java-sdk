// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainEdgeLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDomainEdgeLogResponseBody body;

    public static DescribeLiveDomainEdgeLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainEdgeLogResponse self = new DescribeLiveDomainEdgeLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainEdgeLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainEdgeLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDomainEdgeLogResponse setBody(DescribeLiveDomainEdgeLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainEdgeLogResponseBody getBody() {
        return this.body;
    }

}
