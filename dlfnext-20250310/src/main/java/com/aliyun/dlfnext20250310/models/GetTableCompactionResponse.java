// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetTableCompactionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TableCompaction body;

    public static GetTableCompactionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableCompactionResponse self = new GetTableCompactionResponse();
        return TeaModel.build(map, self);
    }

    public GetTableCompactionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableCompactionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableCompactionResponse setBody(TableCompaction body) {
        this.body = body;
        return this;
    }
    public TableCompaction getBody() {
        return this.body;
    }

}
