// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListRootCauseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRootCauseResponseBody body;

    public static ListRootCauseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRootCauseResponse self = new ListRootCauseResponse();
        return TeaModel.build(map, self);
    }

    public ListRootCauseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRootCauseResponse setBody(ListRootCauseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRootCauseResponseBody getBody() {
        return this.body;
    }

}
