// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineBuildsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRoutineBuildsResponseBody body;

    public static ListRoutineBuildsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineBuildsResponse self = new ListRoutineBuildsResponse();
        return TeaModel.build(map, self);
    }

    public ListRoutineBuildsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoutineBuildsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoutineBuildsResponse setBody(ListRoutineBuildsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoutineBuildsResponseBody getBody() {
        return this.body;
    }

}
