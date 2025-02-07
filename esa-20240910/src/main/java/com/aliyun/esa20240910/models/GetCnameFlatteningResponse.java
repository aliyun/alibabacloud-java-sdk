// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCnameFlatteningResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCnameFlatteningResponseBody body;

    public static GetCnameFlatteningResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCnameFlatteningResponse self = new GetCnameFlatteningResponse();
        return TeaModel.build(map, self);
    }

    public GetCnameFlatteningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCnameFlatteningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCnameFlatteningResponse setBody(GetCnameFlatteningResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCnameFlatteningResponseBody getBody() {
        return this.body;
    }

}
