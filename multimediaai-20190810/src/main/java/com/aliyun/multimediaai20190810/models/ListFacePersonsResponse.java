// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class ListFacePersonsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFacePersonsResponseBody body;

    public static ListFacePersonsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFacePersonsResponse self = new ListFacePersonsResponse();
        return TeaModel.build(map, self);
    }

    public ListFacePersonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFacePersonsResponse setBody(ListFacePersonsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFacePersonsResponseBody getBody() {
        return this.body;
    }

}
