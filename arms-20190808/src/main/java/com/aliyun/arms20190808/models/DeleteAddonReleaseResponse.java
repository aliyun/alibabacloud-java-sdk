// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAddonReleaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAddonReleaseResponseBody body;

    public static DeleteAddonReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAddonReleaseResponse self = new DeleteAddonReleaseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAddonReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAddonReleaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAddonReleaseResponse setBody(DeleteAddonReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAddonReleaseResponseBody getBody() {
        return this.body;
    }

}
