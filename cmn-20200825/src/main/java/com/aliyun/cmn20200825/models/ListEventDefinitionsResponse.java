// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListEventDefinitionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEventDefinitionsResponseBody body;

    public static ListEventDefinitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventDefinitionsResponse self = new ListEventDefinitionsResponse();
        return TeaModel.build(map, self);
    }

    public ListEventDefinitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventDefinitionsResponse setBody(ListEventDefinitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventDefinitionsResponseBody getBody() {
        return this.body;
    }

}
