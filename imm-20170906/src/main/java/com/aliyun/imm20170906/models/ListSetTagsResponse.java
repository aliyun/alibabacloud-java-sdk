// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListSetTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSetTagsResponseBody body;

    public static ListSetTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSetTagsResponse self = new ListSetTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListSetTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSetTagsResponse setBody(ListSetTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSetTagsResponseBody getBody() {
        return this.body;
    }

}
