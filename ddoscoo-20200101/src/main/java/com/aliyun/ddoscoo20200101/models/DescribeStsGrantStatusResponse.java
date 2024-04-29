// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeStsGrantStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStsGrantStatusResponseBody body;

    public static DescribeStsGrantStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStsGrantStatusResponse self = new DescribeStsGrantStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStsGrantStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStsGrantStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStsGrantStatusResponse setBody(DescribeStsGrantStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStsGrantStatusResponseBody getBody() {
        return this.body;
    }

}
