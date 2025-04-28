// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConfigResponseBody body;

    public static DeleteConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigResponse self = new DeleteConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConfigResponse setBody(DeleteConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigResponseBody getBody() {
        return this.body;
    }

}
