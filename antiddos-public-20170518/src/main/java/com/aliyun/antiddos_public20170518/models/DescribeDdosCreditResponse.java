// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosCreditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDdosCreditResponseBody body;

    public static DescribeDdosCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosCreditResponse self = new DescribeDdosCreditResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosCreditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosCreditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDdosCreditResponse setBody(DescribeDdosCreditResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosCreditResponseBody getBody() {
        return this.body;
    }

}
