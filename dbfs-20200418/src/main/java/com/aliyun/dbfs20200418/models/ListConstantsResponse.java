// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListConstantsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConstantsResponseBody body;

    public static ListConstantsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConstantsResponse self = new ListConstantsResponse();
        return TeaModel.build(map, self);
    }

    public ListConstantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConstantsResponse setBody(ListConstantsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConstantsResponseBody getBody() {
        return this.body;
    }

}
