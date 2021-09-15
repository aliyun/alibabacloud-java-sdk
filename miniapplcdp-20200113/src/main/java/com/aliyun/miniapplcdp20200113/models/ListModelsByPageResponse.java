// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModelsByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListModelsByPageResponseBody body;

    public static ListModelsByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelsByPageResponse self = new ListModelsByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListModelsByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelsByPageResponse setBody(ListModelsByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelsByPageResponseBody getBody() {
        return this.body;
    }

}
