// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMdsWhitelistContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMdsWhitelistContentResponseBody body;

    public static DeleteMdsWhitelistContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMdsWhitelistContentResponse self = new DeleteMdsWhitelistContentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMdsWhitelistContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMdsWhitelistContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMdsWhitelistContentResponse setBody(DeleteMdsWhitelistContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMdsWhitelistContentResponseBody getBody() {
        return this.body;
    }

}
