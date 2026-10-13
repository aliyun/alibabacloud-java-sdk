// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdatePortalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePortalResponseBody body;

    public static UpdatePortalResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePortalResponse self = new UpdatePortalResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePortalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePortalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePortalResponse setBody(UpdatePortalResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePortalResponseBody getBody() {
        return this.body;
    }

}
