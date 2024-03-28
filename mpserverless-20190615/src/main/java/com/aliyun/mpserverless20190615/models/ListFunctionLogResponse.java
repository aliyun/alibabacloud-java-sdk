// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFunctionLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFunctionLogResponseBody body;

    public static ListFunctionLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionLogResponse self = new ListFunctionLogResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFunctionLogResponse setBody(ListFunctionLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionLogResponseBody getBody() {
        return this.body;
    }

}
