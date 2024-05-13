// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDdosCountResponseBody body;

    public static DescribeDdosCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosCountResponse self = new DescribeDdosCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDdosCountResponse setBody(DescribeDdosCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosCountResponseBody getBody() {
        return this.body;
    }

}
