// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CreateOrgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrgResponseBody body;

    public static CreateOrgResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrgResponse self = new CreateOrgResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrgResponse setBody(CreateOrgResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrgResponseBody getBody() {
        return this.body;
    }

}
