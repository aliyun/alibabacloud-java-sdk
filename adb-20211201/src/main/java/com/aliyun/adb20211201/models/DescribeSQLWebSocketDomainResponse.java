// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSQLWebSocketDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLWebSocketDomainResponseBody body;

    public static DescribeSQLWebSocketDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLWebSocketDomainResponse self = new DescribeSQLWebSocketDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLWebSocketDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLWebSocketDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLWebSocketDomainResponse setBody(DescribeSQLWebSocketDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLWebSocketDomainResponseBody getBody() {
        return this.body;
    }

}
