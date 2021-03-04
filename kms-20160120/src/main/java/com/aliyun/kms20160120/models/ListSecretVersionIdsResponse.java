// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListSecretVersionIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSecretVersionIdsResponseBody body;

    public static ListSecretVersionIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecretVersionIdsResponse self = new ListSecretVersionIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListSecretVersionIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecretVersionIdsResponse setBody(ListSecretVersionIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecretVersionIdsResponseBody getBody() {
        return this.body;
    }

}
