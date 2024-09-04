// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddVideoDnaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddVideoDnaResponseBody body;

    public static AddVideoDnaResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVideoDnaResponse self = new AddVideoDnaResponse();
        return TeaModel.build(map, self);
    }

    public AddVideoDnaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVideoDnaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddVideoDnaResponse setBody(AddVideoDnaResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVideoDnaResponseBody getBody() {
        return this.body;
    }

}
