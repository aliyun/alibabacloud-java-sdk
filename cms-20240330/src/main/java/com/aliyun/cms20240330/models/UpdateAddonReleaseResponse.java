// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAddonReleaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAddonReleaseResponseBody body;

    public static UpdateAddonReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAddonReleaseResponse self = new UpdateAddonReleaseResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAddonReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAddonReleaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAddonReleaseResponse setBody(UpdateAddonReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAddonReleaseResponseBody getBody() {
        return this.body;
    }

}
