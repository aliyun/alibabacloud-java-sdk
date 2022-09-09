// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListProjectBuildsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectBuildsResponseBody body;

    public static ListProjectBuildsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectBuildsResponse self = new ListProjectBuildsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectBuildsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectBuildsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectBuildsResponse setBody(ListProjectBuildsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectBuildsResponseBody getBody() {
        return this.body;
    }

}
