// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDeptNoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeptNoResponseBody body;

    public static GetDeptNoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeptNoResponse self = new GetDeptNoResponse();
        return TeaModel.build(map, self);
    }

    public GetDeptNoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeptNoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeptNoResponse setBody(GetDeptNoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeptNoResponseBody getBody() {
        return this.body;
    }

}
