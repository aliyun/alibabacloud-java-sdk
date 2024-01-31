// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DepartmentSaveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DepartmentSaveResponseBody body;

    public static DepartmentSaveResponse build(java.util.Map<String, ?> map) throws Exception {
        DepartmentSaveResponse self = new DepartmentSaveResponse();
        return TeaModel.build(map, self);
    }

    public DepartmentSaveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DepartmentSaveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DepartmentSaveResponse setBody(DepartmentSaveResponseBody body) {
        this.body = body;
        return this;
    }
    public DepartmentSaveResponseBody getBody() {
        return this.body;
    }

}
