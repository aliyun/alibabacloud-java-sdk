// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSensitiveSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSensitiveSwitchResponseBody body;

    public static DescribeSensitiveSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveSwitchResponse self = new DescribeSensitiveSwitchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSensitiveSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSensitiveSwitchResponse setBody(DescribeSensitiveSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSensitiveSwitchResponseBody getBody() {
        return this.body;
    }

}
