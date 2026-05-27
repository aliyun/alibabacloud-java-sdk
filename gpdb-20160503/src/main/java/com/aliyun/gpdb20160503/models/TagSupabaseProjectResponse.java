// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class TagSupabaseProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TagSupabaseProjectResponseBody body;

    public static TagSupabaseProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        TagSupabaseProjectResponse self = new TagSupabaseProjectResponse();
        return TeaModel.build(map, self);
    }

    public TagSupabaseProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagSupabaseProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TagSupabaseProjectResponse setBody(TagSupabaseProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public TagSupabaseProjectResponseBody getBody() {
        return this.body;
    }

}
