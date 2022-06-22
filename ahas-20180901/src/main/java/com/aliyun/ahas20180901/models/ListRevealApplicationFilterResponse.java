// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListRevealApplicationFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRevealApplicationFilterResponseBody body;

    public static ListRevealApplicationFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRevealApplicationFilterResponse self = new ListRevealApplicationFilterResponse();
        return TeaModel.build(map, self);
    }

    public ListRevealApplicationFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRevealApplicationFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRevealApplicationFilterResponse setBody(ListRevealApplicationFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRevealApplicationFilterResponseBody getBody() {
        return this.body;
    }

}
