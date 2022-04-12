// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConfigTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfigTemplatesResponseBody body;

    public static ListConfigTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigTemplatesResponse self = new ListConfigTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigTemplatesResponse setBody(ListConfigTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigTemplatesResponseBody getBody() {
        return this.body;
    }

}
