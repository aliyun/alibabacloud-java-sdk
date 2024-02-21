// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDBInstanceConnectivityDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDBInstanceConnectivityDiagnosisResponseBody body;

    public static GetDBInstanceConnectivityDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDBInstanceConnectivityDiagnosisResponse self = new GetDBInstanceConnectivityDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public GetDBInstanceConnectivityDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDBInstanceConnectivityDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDBInstanceConnectivityDiagnosisResponse setBody(GetDBInstanceConnectivityDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDBInstanceConnectivityDiagnosisResponseBody getBody() {
        return this.body;
    }

}
