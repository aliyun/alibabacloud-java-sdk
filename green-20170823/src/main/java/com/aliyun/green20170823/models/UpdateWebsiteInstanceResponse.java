// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateWebsiteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWebsiteInstanceResponseBody body;

    public static UpdateWebsiteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebsiteInstanceResponse self = new UpdateWebsiteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWebsiteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWebsiteInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWebsiteInstanceResponse setBody(UpdateWebsiteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWebsiteInstanceResponseBody getBody() {
        return this.body;
    }

}
