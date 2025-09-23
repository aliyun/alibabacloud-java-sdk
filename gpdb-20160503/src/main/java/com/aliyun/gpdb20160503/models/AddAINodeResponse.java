// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class AddAINodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAINodeResponseBody body;

    public static AddAINodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAINodeResponse self = new AddAINodeResponse();
        return TeaModel.build(map, self);
    }

    public AddAINodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAINodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAINodeResponse setBody(AddAINodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAINodeResponseBody getBody() {
        return this.body;
    }

}
