// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class PauseDataCorrectSQLJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PauseDataCorrectSQLJobResponseBody body;

    public static PauseDataCorrectSQLJobResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseDataCorrectSQLJobResponse self = new PauseDataCorrectSQLJobResponse();
        return TeaModel.build(map, self);
    }

    public PauseDataCorrectSQLJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseDataCorrectSQLJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseDataCorrectSQLJobResponse setBody(PauseDataCorrectSQLJobResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseDataCorrectSQLJobResponseBody getBody() {
        return this.body;
    }

}
