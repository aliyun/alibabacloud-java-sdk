// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseIndicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDiagnoseIndicesResponseBody body;

    public static ListDiagnoseIndicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseIndicesResponse self = new ListDiagnoseIndicesResponse();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseIndicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDiagnoseIndicesResponse setBody(ListDiagnoseIndicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiagnoseIndicesResponseBody getBody() {
        return this.body;
    }

}
