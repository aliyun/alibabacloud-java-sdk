// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListProgramsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProgramsResponseBody body;

    public static ListProgramsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProgramsResponse self = new ListProgramsResponse();
        return TeaModel.build(map, self);
    }

    public ListProgramsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProgramsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProgramsResponse setBody(ListProgramsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProgramsResponseBody getBody() {
        return this.body;
    }

}
