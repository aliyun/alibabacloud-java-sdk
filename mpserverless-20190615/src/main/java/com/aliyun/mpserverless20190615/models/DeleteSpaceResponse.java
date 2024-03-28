// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSpaceResponseBody body;

    public static DeleteSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpaceResponse self = new DeleteSpaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSpaceResponse setBody(DeleteSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSpaceResponseBody getBody() {
        return this.body;
    }

}
