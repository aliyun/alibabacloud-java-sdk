// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnosisItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDiagnosisItemsResponseBody body;

    public static ListDiagnosisItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosisItemsResponse self = new ListDiagnosisItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListDiagnosisItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDiagnosisItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDiagnosisItemsResponse setBody(ListDiagnosisItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiagnosisItemsResponseBody getBody() {
        return this.body;
    }

}
