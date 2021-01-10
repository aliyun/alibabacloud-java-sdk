// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDetectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDetectionsResponseBody body;

    public static ListDetectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionsResponse self = new ListDetectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDetectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDetectionsResponse setBody(ListDetectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDetectionsResponseBody getBody() {
        return this.body;
    }

}
