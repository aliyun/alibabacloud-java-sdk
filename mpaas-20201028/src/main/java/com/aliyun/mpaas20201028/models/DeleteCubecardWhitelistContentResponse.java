// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteCubecardWhitelistContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCubecardWhitelistContentResponseBody body;

    public static DeleteCubecardWhitelistContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCubecardWhitelistContentResponse self = new DeleteCubecardWhitelistContentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCubecardWhitelistContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCubecardWhitelistContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCubecardWhitelistContentResponse setBody(DeleteCubecardWhitelistContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCubecardWhitelistContentResponseBody getBody() {
        return this.body;
    }

}
