// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteCustomLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSiteCustomLogResponseBody body;

    public static CreateSiteCustomLogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteCustomLogResponse self = new CreateSiteCustomLogResponse();
        return TeaModel.build(map, self);
    }

    public CreateSiteCustomLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSiteCustomLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSiteCustomLogResponse setBody(CreateSiteCustomLogResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSiteCustomLogResponseBody getBody() {
        return this.body;
    }

}
