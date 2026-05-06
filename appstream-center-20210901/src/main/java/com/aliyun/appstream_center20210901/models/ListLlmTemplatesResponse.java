// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListLlmTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLlmTemplatesResponseBody body;

    public static ListLlmTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLlmTemplatesResponse self = new ListLlmTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListLlmTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLlmTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLlmTemplatesResponse setBody(ListLlmTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLlmTemplatesResponseBody getBody() {
        return this.body;
    }

}
