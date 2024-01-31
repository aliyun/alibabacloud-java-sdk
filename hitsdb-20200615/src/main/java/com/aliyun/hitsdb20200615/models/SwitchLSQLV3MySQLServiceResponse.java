// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class SwitchLSQLV3MySQLServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchLSQLV3MySQLServiceResponseBody body;

    public static SwitchLSQLV3MySQLServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchLSQLV3MySQLServiceResponse self = new SwitchLSQLV3MySQLServiceResponse();
        return TeaModel.build(map, self);
    }

    public SwitchLSQLV3MySQLServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchLSQLV3MySQLServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchLSQLV3MySQLServiceResponse setBody(SwitchLSQLV3MySQLServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchLSQLV3MySQLServiceResponseBody getBody() {
        return this.body;
    }

}
