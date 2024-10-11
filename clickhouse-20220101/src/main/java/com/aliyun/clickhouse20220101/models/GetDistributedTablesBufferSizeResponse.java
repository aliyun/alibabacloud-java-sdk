// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class GetDistributedTablesBufferSizeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDistributedTablesBufferSizeResponseBody body;

    public static GetDistributedTablesBufferSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDistributedTablesBufferSizeResponse self = new GetDistributedTablesBufferSizeResponse();
        return TeaModel.build(map, self);
    }

    public GetDistributedTablesBufferSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDistributedTablesBufferSizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDistributedTablesBufferSizeResponse setBody(GetDistributedTablesBufferSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDistributedTablesBufferSizeResponseBody getBody() {
        return this.body;
    }

}
