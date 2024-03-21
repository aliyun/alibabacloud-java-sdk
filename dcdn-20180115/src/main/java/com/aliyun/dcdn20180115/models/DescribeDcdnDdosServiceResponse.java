// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDdosServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDdosServiceResponseBody body;

    public static DescribeDcdnDdosServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDdosServiceResponse self = new DescribeDcdnDdosServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDdosServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDdosServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDdosServiceResponse setBody(DescribeDcdnDdosServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDdosServiceResponseBody getBody() {
        return this.body;
    }

}
