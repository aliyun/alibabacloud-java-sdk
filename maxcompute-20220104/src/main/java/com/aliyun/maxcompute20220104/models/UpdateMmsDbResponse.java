// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsDbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMmsDbResponseBody body;

    public static UpdateMmsDbResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsDbResponse self = new UpdateMmsDbResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMmsDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMmsDbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMmsDbResponse setBody(UpdateMmsDbResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMmsDbResponseBody getBody() {
        return this.body;
    }

}
