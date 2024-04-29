// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAttackTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDosEventAttackTypeResponseBody body;

    public static DescribeDDosEventAttackTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventAttackTypeResponse self = new DescribeDDosEventAttackTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventAttackTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDosEventAttackTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDosEventAttackTypeResponse setBody(DescribeDDosEventAttackTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDosEventAttackTypeResponseBody getBody() {
        return this.body;
    }

}
