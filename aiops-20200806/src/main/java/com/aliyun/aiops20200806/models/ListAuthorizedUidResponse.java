// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListAuthorizedUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthorizedUidResponseBody body;

    public static ListAuthorizedUidResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUidResponse self = new ListAuthorizedUidResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizedUidResponse setBody(ListAuthorizedUidResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizedUidResponseBody getBody() {
        return this.body;
    }

}
