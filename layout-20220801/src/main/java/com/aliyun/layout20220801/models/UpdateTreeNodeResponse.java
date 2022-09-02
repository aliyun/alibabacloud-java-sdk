// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class UpdateTreeNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTreeNodeResponseBody body;

    public static UpdateTreeNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTreeNodeResponse self = new UpdateTreeNodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTreeNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTreeNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTreeNodeResponse setBody(UpdateTreeNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTreeNodeResponseBody getBody() {
        return this.body;
    }

}
