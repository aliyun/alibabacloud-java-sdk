// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CancelRestoreJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelRestoreJobResponseBody body;

    public static CancelRestoreJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelRestoreJobResponse self = new CancelRestoreJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelRestoreJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelRestoreJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelRestoreJobResponse setBody(CancelRestoreJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelRestoreJobResponseBody getBody() {
        return this.body;
    }

}
