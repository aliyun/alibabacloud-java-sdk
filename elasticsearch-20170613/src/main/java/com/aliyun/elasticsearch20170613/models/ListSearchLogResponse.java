// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListSearchLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSearchLogResponseBody body;

    public static ListSearchLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSearchLogResponse self = new ListSearchLogResponse();
        return TeaModel.build(map, self);
    }

    public ListSearchLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSearchLogResponse setBody(ListSearchLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSearchLogResponseBody getBody() {
        return this.body;
    }

}
