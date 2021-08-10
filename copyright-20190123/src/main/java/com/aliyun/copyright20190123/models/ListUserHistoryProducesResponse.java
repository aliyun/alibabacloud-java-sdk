// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ListUserHistoryProducesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserHistoryProducesResponseBody body;

    public static ListUserHistoryProducesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserHistoryProducesResponse self = new ListUserHistoryProducesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserHistoryProducesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserHistoryProducesResponse setBody(ListUserHistoryProducesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserHistoryProducesResponseBody getBody() {
        return this.body;
    }

}
