// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMmsTablesResponseBody body;

    public static UpdateMmsTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsTablesResponse self = new UpdateMmsTablesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMmsTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMmsTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMmsTablesResponse setBody(UpdateMmsTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMmsTablesResponseBody getBody() {
        return this.body;
    }

}
