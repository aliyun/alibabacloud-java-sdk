// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlLogConfigResponseBody body;

    public static DescribeSqlLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogConfigResponse self = new DescribeSqlLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlLogConfigResponse setBody(DescribeSqlLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlLogConfigResponseBody getBody() {
        return this.body;
    }

}
