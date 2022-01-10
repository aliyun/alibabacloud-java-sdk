// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListQuotasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListQuotasResponseBody body;

    public static ListQuotasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasResponse self = new ListQuotasResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotasResponse setBody(ListQuotasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotasResponseBody getBody() {
        return this.body;
    }

}
