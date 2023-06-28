// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListFunctionVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVersionsOutput body;

    public static ListFunctionVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionVersionsResponse self = new ListFunctionVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFunctionVersionsResponse setBody(ListVersionsOutput body) {
        this.body = body;
        return this;
    }
    public ListVersionsOutput getBody() {
        return this.body;
    }

}
