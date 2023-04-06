// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class ListModelNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListModelNamesResponseBody body;

    public static ListModelNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelNamesResponse self = new ListModelNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListModelNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelNamesResponse setBody(ListModelNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelNamesResponseBody getBody() {
        return this.body;
    }

}
