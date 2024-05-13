// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeBgpPackByIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBgpPackByIpResponseBody body;

    public static DescribeBgpPackByIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpPackByIpResponse self = new DescribeBgpPackByIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBgpPackByIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBgpPackByIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBgpPackByIpResponse setBody(DescribeBgpPackByIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBgpPackByIpResponseBody getBody() {
        return this.body;
    }

}
