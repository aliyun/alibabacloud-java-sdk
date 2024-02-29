// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartDIJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDIJobResponseBody body;

    public static StartDIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDIJobResponse self = new StartDIJobResponse();
        return TeaModel.build(map, self);
    }

    public StartDIJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDIJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDIJobResponse setBody(StartDIJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDIJobResponseBody getBody() {
        return this.body;
    }

}
