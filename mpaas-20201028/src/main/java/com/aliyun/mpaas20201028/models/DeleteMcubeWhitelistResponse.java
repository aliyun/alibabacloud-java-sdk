// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcubeWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMcubeWhitelistResponseBody body;

    public static DeleteMcubeWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeWhitelistResponse self = new DeleteMcubeWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcubeWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMcubeWhitelistResponse setBody(DeleteMcubeWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcubeWhitelistResponseBody getBody() {
        return this.body;
    }

}
