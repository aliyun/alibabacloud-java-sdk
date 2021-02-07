// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListAppSecretIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppSecretIdsResponseBody body;

    public static ListAppSecretIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppSecretIdsResponse self = new ListAppSecretIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppSecretIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppSecretIdsResponse setBody(ListAppSecretIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppSecretIdsResponseBody getBody() {
        return this.body;
    }

}
