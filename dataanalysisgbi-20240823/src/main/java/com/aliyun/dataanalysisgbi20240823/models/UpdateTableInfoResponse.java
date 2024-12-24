// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class UpdateTableInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTableInfoResponseBody body;

    public static UpdateTableInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableInfoResponse self = new UpdateTableInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTableInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTableInfoResponse setBody(UpdateTableInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTableInfoResponseBody getBody() {
        return this.body;
    }

}
