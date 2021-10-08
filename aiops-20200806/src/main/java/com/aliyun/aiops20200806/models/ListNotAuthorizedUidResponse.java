// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListNotAuthorizedUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNotAuthorizedUidResponseBody body;

    public static ListNotAuthorizedUidResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNotAuthorizedUidResponse self = new ListNotAuthorizedUidResponse();
        return TeaModel.build(map, self);
    }

    public ListNotAuthorizedUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNotAuthorizedUidResponse setBody(ListNotAuthorizedUidResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNotAuthorizedUidResponseBody getBody() {
        return this.body;
    }

}
