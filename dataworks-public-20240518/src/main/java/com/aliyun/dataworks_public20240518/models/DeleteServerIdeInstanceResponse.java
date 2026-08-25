// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteServerIdeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServerIdeInstanceResponseBody body;

    public static DeleteServerIdeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServerIdeInstanceResponse self = new DeleteServerIdeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServerIdeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServerIdeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServerIdeInstanceResponse setBody(DeleteServerIdeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServerIdeInstanceResponseBody getBody() {
        return this.body;
    }

}
