// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertDropDownListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertDropDownListResponseBody body;

    public static InsertDropDownListResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertDropDownListResponse self = new InsertDropDownListResponse();
        return TeaModel.build(map, self);
    }

    public InsertDropDownListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertDropDownListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertDropDownListResponse setBody(InsertDropDownListResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertDropDownListResponseBody getBody() {
        return this.body;
    }

}
