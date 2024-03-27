// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BackFillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BackFillResponseBody body;

    public static BackFillResponse build(java.util.Map<String, ?> map) throws Exception {
        BackFillResponse self = new BackFillResponse();
        return TeaModel.build(map, self);
    }

    public BackFillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BackFillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BackFillResponse setBody(BackFillResponseBody body) {
        this.body = body;
        return this;
    }
    public BackFillResponseBody getBody() {
        return this.body;
    }

}
