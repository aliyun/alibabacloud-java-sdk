// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CancelCreateIndexJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelCreateIndexJobResponseBody body;

    public static CancelCreateIndexJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCreateIndexJobResponse self = new CancelCreateIndexJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelCreateIndexJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCreateIndexJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelCreateIndexJobResponse setBody(CancelCreateIndexJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCreateIndexJobResponseBody getBody() {
        return this.body;
    }

}
