// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnEsExecuteDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnEsExecuteDataResponseBody body;

    public static DescribeDcdnEsExecuteDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnEsExecuteDataResponse self = new DescribeDcdnEsExecuteDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnEsExecuteDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnEsExecuteDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnEsExecuteDataResponse setBody(DescribeDcdnEsExecuteDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnEsExecuteDataResponseBody getBody() {
        return this.body;
    }

}
