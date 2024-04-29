// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventIspResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDosEventIspResponseBody body;

    public static DescribeDDosEventIspResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventIspResponse self = new DescribeDDosEventIspResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventIspResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDosEventIspResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDosEventIspResponse setBody(DescribeDDosEventIspResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDosEventIspResponseBody getBody() {
        return this.body;
    }

}
