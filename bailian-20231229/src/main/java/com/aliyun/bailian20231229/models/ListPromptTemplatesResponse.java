// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListPromptTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPromptTemplatesResponseBody body;

    public static ListPromptTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPromptTemplatesResponse self = new ListPromptTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListPromptTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPromptTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPromptTemplatesResponse setBody(ListPromptTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPromptTemplatesResponseBody getBody() {
        return this.body;
    }

}
