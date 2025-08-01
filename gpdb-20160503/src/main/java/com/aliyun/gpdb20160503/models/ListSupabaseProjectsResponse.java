// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupabaseProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSupabaseProjectsResponseBody body;

    public static ListSupabaseProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupabaseProjectsResponse self = new ListSupabaseProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListSupabaseProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupabaseProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSupabaseProjectsResponse setBody(ListSupabaseProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupabaseProjectsResponseBody getBody() {
        return this.body;
    }

}
