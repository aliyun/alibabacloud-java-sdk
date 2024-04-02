// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateWebsiteInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWebsiteInstanceStatusResponseBody body;

    public static UpdateWebsiteInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebsiteInstanceStatusResponse self = new UpdateWebsiteInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWebsiteInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWebsiteInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWebsiteInstanceStatusResponse setBody(UpdateWebsiteInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWebsiteInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
