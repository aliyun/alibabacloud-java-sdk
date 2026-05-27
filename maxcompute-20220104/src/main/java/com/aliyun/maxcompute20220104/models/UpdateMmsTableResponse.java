// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMmsTableResponseBody body;

    public static UpdateMmsTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsTableResponse self = new UpdateMmsTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMmsTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMmsTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMmsTableResponse setBody(UpdateMmsTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMmsTableResponseBody getBody() {
        return this.body;
    }

}
