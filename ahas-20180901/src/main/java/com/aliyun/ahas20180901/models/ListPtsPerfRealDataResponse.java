// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListPtsPerfRealDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPtsPerfRealDataResponseBody body;

    public static ListPtsPerfRealDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPtsPerfRealDataResponse self = new ListPtsPerfRealDataResponse();
        return TeaModel.build(map, self);
    }

    public ListPtsPerfRealDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPtsPerfRealDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPtsPerfRealDataResponse setBody(ListPtsPerfRealDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPtsPerfRealDataResponseBody getBody() {
        return this.body;
    }

}
