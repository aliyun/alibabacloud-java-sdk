// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSiteResponseBody body;

    public static CreateSiteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteResponse self = new CreateSiteResponse();
        return TeaModel.build(map, self);
    }

    public CreateSiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSiteResponse setBody(CreateSiteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSiteResponseBody getBody() {
        return this.body;
    }

}
