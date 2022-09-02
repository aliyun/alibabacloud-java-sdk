// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class AddTreeNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddTreeNodeResponseBody body;

    public static AddTreeNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTreeNodeResponse self = new AddTreeNodeResponse();
        return TeaModel.build(map, self);
    }

    public AddTreeNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTreeNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTreeNodeResponse setBody(AddTreeNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTreeNodeResponseBody getBody() {
        return this.body;
    }

}
