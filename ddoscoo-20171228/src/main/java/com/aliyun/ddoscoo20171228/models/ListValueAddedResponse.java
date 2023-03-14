// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListValueAddedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListValueAddedResponseBody body;

    public static ListValueAddedResponse build(java.util.Map<String, ?> map) throws Exception {
        ListValueAddedResponse self = new ListValueAddedResponse();
        return TeaModel.build(map, self);
    }

    public ListValueAddedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListValueAddedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListValueAddedResponse setBody(ListValueAddedResponseBody body) {
        this.body = body;
        return this;
    }
    public ListValueAddedResponseBody getBody() {
        return this.body;
    }

}
