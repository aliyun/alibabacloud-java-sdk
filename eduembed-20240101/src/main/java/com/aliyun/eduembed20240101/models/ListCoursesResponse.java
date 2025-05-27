// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class ListCoursesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCoursesResponseBody body;

    public static ListCoursesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCoursesResponse self = new ListCoursesResponse();
        return TeaModel.build(map, self);
    }

    public ListCoursesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCoursesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCoursesResponse setBody(ListCoursesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCoursesResponseBody getBody() {
        return this.body;
    }

}
