// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListFunctionFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFunctionFilesResponseBody body;

    public static ListFunctionFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionFilesResponse self = new ListFunctionFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionFilesResponse setBody(ListFunctionFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionFilesResponseBody getBody() {
        return this.body;
    }

}
