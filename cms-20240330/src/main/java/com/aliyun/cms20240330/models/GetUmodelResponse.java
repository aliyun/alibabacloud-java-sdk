// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetUmodelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUmodelResponseBody body;

    public static GetUmodelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUmodelResponse self = new GetUmodelResponse();
        return TeaModel.build(map, self);
    }

    public GetUmodelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUmodelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUmodelResponse setBody(GetUmodelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUmodelResponseBody getBody() {
        return this.body;
    }

}
