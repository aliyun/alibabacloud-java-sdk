// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableModelInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTableModelInfoResponseBody body;

    public static UpdateTableModelInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableModelInfoResponse self = new UpdateTableModelInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTableModelInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTableModelInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTableModelInfoResponse setBody(UpdateTableModelInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTableModelInfoResponseBody getBody() {
        return this.body;
    }

}
