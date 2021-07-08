// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListAppTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppTemplatesResponseBody body;

    public static ListAppTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppTemplatesResponse self = new ListAppTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppTemplatesResponse setBody(ListAppTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppTemplatesResponseBody getBody() {
        return this.body;
    }

}
