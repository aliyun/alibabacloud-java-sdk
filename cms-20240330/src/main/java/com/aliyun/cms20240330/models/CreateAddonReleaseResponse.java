// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAddonReleaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAddonReleaseResponseBody body;

    public static CreateAddonReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAddonReleaseResponse self = new CreateAddonReleaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateAddonReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAddonReleaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAddonReleaseResponse setBody(CreateAddonReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAddonReleaseResponseBody getBody() {
        return this.body;
    }

}
