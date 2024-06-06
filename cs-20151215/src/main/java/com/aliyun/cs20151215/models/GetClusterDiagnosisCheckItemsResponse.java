// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterDiagnosisCheckItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterDiagnosisCheckItemsResponseBody body;

    public static GetClusterDiagnosisCheckItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDiagnosisCheckItemsResponse self = new GetClusterDiagnosisCheckItemsResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterDiagnosisCheckItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterDiagnosisCheckItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterDiagnosisCheckItemsResponse setBody(GetClusterDiagnosisCheckItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterDiagnosisCheckItemsResponseBody getBody() {
        return this.body;
    }

}
