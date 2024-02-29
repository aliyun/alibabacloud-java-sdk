// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaCategoryResponseBody body;

    public static GetMetaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCategoryResponse self = new GetMetaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaCategoryResponse setBody(GetMetaCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaCategoryResponseBody getBody() {
        return this.body;
    }

}
