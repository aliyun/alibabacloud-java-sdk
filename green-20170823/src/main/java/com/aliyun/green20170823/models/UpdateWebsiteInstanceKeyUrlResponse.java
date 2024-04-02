// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateWebsiteInstanceKeyUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWebsiteInstanceKeyUrlResponseBody body;

    public static UpdateWebsiteInstanceKeyUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebsiteInstanceKeyUrlResponse self = new UpdateWebsiteInstanceKeyUrlResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWebsiteInstanceKeyUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWebsiteInstanceKeyUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWebsiteInstanceKeyUrlResponse setBody(UpdateWebsiteInstanceKeyUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWebsiteInstanceKeyUrlResponseBody getBody() {
        return this.body;
    }

}
