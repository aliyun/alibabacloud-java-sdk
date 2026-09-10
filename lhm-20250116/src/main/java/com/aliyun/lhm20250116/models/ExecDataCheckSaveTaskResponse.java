// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckSaveTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecDataCheckSaveTaskResponseBody body;

    public static ExecDataCheckSaveTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckSaveTaskResponse self = new ExecDataCheckSaveTaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckSaveTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDataCheckSaveTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecDataCheckSaveTaskResponse setBody(ExecDataCheckSaveTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDataCheckSaveTaskResponseBody getBody() {
        return this.body;
    }

}
