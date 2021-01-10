// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListFunctionFilesByProjectIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFunctionFilesByProjectIdResponseBody body;

    public static ListFunctionFilesByProjectIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionFilesByProjectIdResponse self = new ListFunctionFilesByProjectIdResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionFilesByProjectIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionFilesByProjectIdResponse setBody(ListFunctionFilesByProjectIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionFilesByProjectIdResponseBody getBody() {
        return this.body;
    }

}
