// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RestartDataCorrectSQLJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RestartDataCorrectSQLJobResponseBody body;

    public static RestartDataCorrectSQLJobResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDataCorrectSQLJobResponse self = new RestartDataCorrectSQLJobResponse();
        return TeaModel.build(map, self);
    }

    public RestartDataCorrectSQLJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartDataCorrectSQLJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartDataCorrectSQLJobResponse setBody(RestartDataCorrectSQLJobResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartDataCorrectSQLJobResponseBody getBody() {
        return this.body;
    }

}
