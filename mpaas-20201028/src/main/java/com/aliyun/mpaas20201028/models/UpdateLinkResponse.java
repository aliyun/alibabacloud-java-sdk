// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLinkResponseBody body;

    public static UpdateLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkResponse self = new UpdateLinkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLinkResponse setBody(UpdateLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkResponseBody getBody() {
        return this.body;
    }

}
