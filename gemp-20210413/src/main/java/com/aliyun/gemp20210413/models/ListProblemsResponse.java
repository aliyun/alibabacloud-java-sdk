// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProblemsResponseBody body;

    public static ListProblemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProblemsResponse self = new ListProblemsResponse();
        return TeaModel.build(map, self);
    }

    public ListProblemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProblemsResponse setBody(ListProblemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProblemsResponseBody getBody() {
        return this.body;
    }

}
