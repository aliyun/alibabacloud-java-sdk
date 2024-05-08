// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDepartmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDepartmentResponseBody body;

    public static GetDepartmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDepartmentResponse self = new GetDepartmentResponse();
        return TeaModel.build(map, self);
    }

    public GetDepartmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDepartmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDepartmentResponse setBody(GetDepartmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDepartmentResponseBody getBody() {
        return this.body;
    }

}
