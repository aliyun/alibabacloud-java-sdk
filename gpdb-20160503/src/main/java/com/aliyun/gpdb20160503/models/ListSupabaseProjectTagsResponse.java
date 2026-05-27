// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupabaseProjectTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSupabaseProjectTagsResponseBody body;

    public static ListSupabaseProjectTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupabaseProjectTagsResponse self = new ListSupabaseProjectTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListSupabaseProjectTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupabaseProjectTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSupabaseProjectTagsResponse setBody(ListSupabaseProjectTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupabaseProjectTagsResponseBody getBody() {
        return this.body;
    }

}
