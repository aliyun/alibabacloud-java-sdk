// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListCorpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCorpResponseBody body;

    public static ListCorpResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCorpResponse self = new ListCorpResponse();
        return TeaModel.build(map, self);
    }

    public ListCorpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCorpResponse setBody(ListCorpResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCorpResponseBody getBody() {
        return this.body;
    }

}
