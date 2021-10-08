// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListConfirmAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfirmAuthorizationResponseBody body;

    public static ListConfirmAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfirmAuthorizationResponse self = new ListConfirmAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ListConfirmAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfirmAuthorizationResponse setBody(ListConfirmAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfirmAuthorizationResponseBody getBody() {
        return this.body;
    }

}
