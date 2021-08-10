// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ListUserProducesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserProducesResponseBody body;

    public static ListUserProducesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserProducesResponse self = new ListUserProducesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserProducesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserProducesResponse setBody(ListUserProducesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserProducesResponseBody getBody() {
        return this.body;
    }

}
