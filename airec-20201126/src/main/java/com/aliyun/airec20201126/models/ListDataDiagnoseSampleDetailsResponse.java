// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDataDiagnoseSampleDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataDiagnoseSampleDetailsResponseBody body;

    public static ListDataDiagnoseSampleDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnoseSampleDetailsResponse self = new ListDataDiagnoseSampleDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnoseSampleDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataDiagnoseSampleDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataDiagnoseSampleDetailsResponse setBody(ListDataDiagnoseSampleDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataDiagnoseSampleDetailsResponseBody getBody() {
        return this.body;
    }

}
