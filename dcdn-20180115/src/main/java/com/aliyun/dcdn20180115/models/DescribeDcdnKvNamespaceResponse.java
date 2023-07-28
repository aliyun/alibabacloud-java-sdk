// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnKvNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnKvNamespaceResponseBody body;

    public static DescribeDcdnKvNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnKvNamespaceResponse self = new DescribeDcdnKvNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnKvNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnKvNamespaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnKvNamespaceResponse setBody(DescribeDcdnKvNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnKvNamespaceResponseBody getBody() {
        return this.body;
    }

}
