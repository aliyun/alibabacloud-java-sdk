// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class ListMyAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMyAlgorithmResponseBody body;

    public static ListMyAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMyAlgorithmResponse self = new ListMyAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public ListMyAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMyAlgorithmResponse setBody(ListMyAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMyAlgorithmResponseBody getBody() {
        return this.body;
    }

}
