// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateWebSiteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWebSiteInstanceResponseBody body;

    public static CreateWebSiteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebSiteInstanceResponse self = new CreateWebSiteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebSiteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebSiteInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWebSiteInstanceResponse setBody(CreateWebSiteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWebSiteInstanceResponseBody getBody() {
        return this.body;
    }

}
