// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListSlsReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSlsReportsResponseBody body;

    public static ListSlsReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSlsReportsResponse self = new ListSlsReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListSlsReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSlsReportsResponse setBody(ListSlsReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSlsReportsResponseBody getBody() {
        return this.body;
    }

}
