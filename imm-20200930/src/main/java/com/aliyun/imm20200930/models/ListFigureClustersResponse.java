// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListFigureClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFigureClustersResponseBody body;

    public static ListFigureClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFigureClustersResponse self = new ListFigureClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListFigureClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFigureClustersResponse setBody(ListFigureClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFigureClustersResponseBody getBody() {
        return this.body;
    }

}
