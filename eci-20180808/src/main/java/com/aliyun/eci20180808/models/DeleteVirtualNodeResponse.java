// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DeleteVirtualNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVirtualNodeResponseBody body;

    public static DeleteVirtualNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualNodeResponse self = new DeleteVirtualNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVirtualNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVirtualNodeResponse setBody(DeleteVirtualNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVirtualNodeResponseBody getBody() {
        return this.body;
    }

}
