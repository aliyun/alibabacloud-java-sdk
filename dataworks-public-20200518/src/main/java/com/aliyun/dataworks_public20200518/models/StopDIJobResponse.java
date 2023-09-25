// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StopDIJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopDIJobResponseBody body;

    public static StopDIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDIJobResponse self = new StopDIJobResponse();
        return TeaModel.build(map, self);
    }

    public StopDIJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDIJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDIJobResponse setBody(StopDIJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDIJobResponseBody getBody() {
        return this.body;
    }

}
