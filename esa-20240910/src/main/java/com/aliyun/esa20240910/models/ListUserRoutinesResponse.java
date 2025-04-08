// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserRoutinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserRoutinesResponseBody body;

    public static ListUserRoutinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserRoutinesResponse self = new ListUserRoutinesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserRoutinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserRoutinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserRoutinesResponse setBody(ListUserRoutinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserRoutinesResponseBody getBody() {
        return this.body;
    }

}
