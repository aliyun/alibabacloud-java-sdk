// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteMaintainWindowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMaintainWindowResponseBody body;

    public static DeleteMaintainWindowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaintainWindowResponse self = new DeleteMaintainWindowResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMaintainWindowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMaintainWindowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMaintainWindowResponse setBody(DeleteMaintainWindowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMaintainWindowResponseBody getBody() {
        return this.body;
    }

}
