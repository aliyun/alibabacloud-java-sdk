// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReupgradeOTATaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReupgradeOTATaskResponseBody body;

    public static ReupgradeOTATaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReupgradeOTATaskResponse self = new ReupgradeOTATaskResponse();
        return TeaModel.build(map, self);
    }

    public ReupgradeOTATaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReupgradeOTATaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReupgradeOTATaskResponse setBody(ReupgradeOTATaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ReupgradeOTATaskResponseBody getBody() {
        return this.body;
    }

}
