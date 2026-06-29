// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSOverseasAttackCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDoSOverseasAttackCountResponseBody body;

    public static DescribeDDoSOverseasAttackCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSOverseasAttackCountResponse self = new DescribeDDoSOverseasAttackCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSOverseasAttackCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDoSOverseasAttackCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDoSOverseasAttackCountResponse setBody(DescribeDDoSOverseasAttackCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDoSOverseasAttackCountResponseBody getBody() {
        return this.body;
    }

}
