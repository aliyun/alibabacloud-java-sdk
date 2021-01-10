// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListLivesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLivesResponseBody body;

    public static ListLivesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLivesResponse self = new ListLivesResponse();
        return TeaModel.build(map, self);
    }

    public ListLivesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLivesResponse setBody(ListLivesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLivesResponseBody getBody() {
        return this.body;
    }

}
