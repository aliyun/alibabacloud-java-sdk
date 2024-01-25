// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateTagInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTagInfoResponseBody body;

    public static UpdateTagInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTagInfoResponse self = new UpdateTagInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTagInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTagInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTagInfoResponse setBody(UpdateTagInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTagInfoResponseBody getBody() {
        return this.body;
    }

}
