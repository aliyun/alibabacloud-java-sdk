// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineOptionalSpecsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRoutineOptionalSpecsResponseBody body;

    public static ListRoutineOptionalSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineOptionalSpecsResponse self = new ListRoutineOptionalSpecsResponse();
        return TeaModel.build(map, self);
    }

    public ListRoutineOptionalSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoutineOptionalSpecsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoutineOptionalSpecsResponse setBody(ListRoutineOptionalSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoutineOptionalSpecsResponseBody getBody() {
        return this.body;
    }

}
