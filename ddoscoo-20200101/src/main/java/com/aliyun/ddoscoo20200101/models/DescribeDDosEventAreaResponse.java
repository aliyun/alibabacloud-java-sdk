// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAreaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDosEventAreaResponseBody body;

    public static DescribeDDosEventAreaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventAreaResponse self = new DescribeDDosEventAreaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventAreaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDosEventAreaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDosEventAreaResponse setBody(DescribeDDosEventAreaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDosEventAreaResponseBody getBody() {
        return this.body;
    }

}
