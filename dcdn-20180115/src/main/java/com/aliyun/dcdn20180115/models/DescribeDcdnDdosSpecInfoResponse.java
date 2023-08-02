// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDdosSpecInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDdosSpecInfoResponseBody body;

    public static DescribeDcdnDdosSpecInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDdosSpecInfoResponse self = new DescribeDcdnDdosSpecInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDdosSpecInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDdosSpecInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDdosSpecInfoResponse setBody(DescribeDcdnDdosSpecInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDdosSpecInfoResponseBody getBody() {
        return this.body;
    }

}
