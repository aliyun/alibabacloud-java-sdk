// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ListAstralnetAppUrlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAstralnetAppUrlsResponseBody body;

    public static ListAstralnetAppUrlsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAstralnetAppUrlsResponse self = new ListAstralnetAppUrlsResponse();
        return TeaModel.build(map, self);
    }

    public ListAstralnetAppUrlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAstralnetAppUrlsResponse setBody(ListAstralnetAppUrlsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAstralnetAppUrlsResponseBody getBody() {
        return this.body;
    }

}
