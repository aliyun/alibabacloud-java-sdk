// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineRoutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRoutineRoutesResponseBody body;

    public static ListRoutineRoutesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineRoutesResponse self = new ListRoutineRoutesResponse();
        return TeaModel.build(map, self);
    }

    public ListRoutineRoutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoutineRoutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoutineRoutesResponse setBody(ListRoutineRoutesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoutineRoutesResponseBody getBody() {
        return this.body;
    }

}
