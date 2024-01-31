// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLindormInstanceResponseBody body;

    public static GetLindormInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLindormInstanceResponse self = new GetLindormInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetLindormInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLindormInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLindormInstanceResponse setBody(GetLindormInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLindormInstanceResponseBody getBody() {
        return this.body;
    }

}
