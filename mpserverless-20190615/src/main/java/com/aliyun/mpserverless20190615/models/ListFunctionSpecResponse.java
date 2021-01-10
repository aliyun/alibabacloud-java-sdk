// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFunctionSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFunctionSpecResponseBody body;

    public static ListFunctionSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionSpecResponse self = new ListFunctionSpecResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionSpecResponse setBody(ListFunctionSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionSpecResponseBody getBody() {
        return this.body;
    }

}
