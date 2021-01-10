// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ListAlgorithmsByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlgorithmsByPageResponseBody body;

    public static ListAlgorithmsByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlgorithmsByPageResponse self = new ListAlgorithmsByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListAlgorithmsByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlgorithmsByPageResponse setBody(ListAlgorithmsByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlgorithmsByPageResponseBody getBody() {
        return this.body;
    }

}
