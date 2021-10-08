// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListApplyAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplyAuthorizationResponseBody body;

    public static ListApplyAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplyAuthorizationResponse self = new ListApplyAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ListApplyAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplyAuthorizationResponse setBody(ListApplyAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplyAuthorizationResponseBody getBody() {
        return this.body;
    }

}
