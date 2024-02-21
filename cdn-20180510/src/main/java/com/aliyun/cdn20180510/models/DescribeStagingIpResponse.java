// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeStagingIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStagingIpResponseBody body;

    public static DescribeStagingIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStagingIpResponse self = new DescribeStagingIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStagingIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStagingIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStagingIpResponse setBody(DescribeStagingIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStagingIpResponseBody getBody() {
        return this.body;
    }

}
