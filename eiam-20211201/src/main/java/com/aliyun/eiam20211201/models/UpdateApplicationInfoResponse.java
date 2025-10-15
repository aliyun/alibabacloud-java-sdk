// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationInfoResponseBody body;

    public static UpdateApplicationInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationInfoResponse self = new UpdateApplicationInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationInfoResponse setBody(UpdateApplicationInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationInfoResponseBody getBody() {
        return this.body;
    }

}
