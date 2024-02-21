// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnoseIndicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListDiagnoseIndicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDiagnoseIndicesResponse setBody(ListDiagnoseIndicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiagnoseIndicesResponseBody getBody() {
        return this.body;
    }

}
