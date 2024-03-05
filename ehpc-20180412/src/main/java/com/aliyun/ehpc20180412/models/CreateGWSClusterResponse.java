// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateGWSClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGWSClusterResponseBody body;

    public static CreateGWSClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGWSClusterResponse self = new CreateGWSClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateGWSClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGWSClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGWSClusterResponse setBody(CreateGWSClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGWSClusterResponseBody getBody() {
        return this.body;
    }

}
