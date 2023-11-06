// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBroadcastTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBroadcastTablesResponseBody body;

    public static DescribeBroadcastTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBroadcastTablesResponse self = new DescribeBroadcastTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBroadcastTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBroadcastTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBroadcastTablesResponse setBody(DescribeBroadcastTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBroadcastTablesResponseBody getBody() {
        return this.body;
    }

}
