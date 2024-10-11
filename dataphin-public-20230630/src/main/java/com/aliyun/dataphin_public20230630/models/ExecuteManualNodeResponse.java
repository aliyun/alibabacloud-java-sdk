// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteManualNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteManualNodeResponseBody body;

    public static ExecuteManualNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteManualNodeResponse self = new ExecuteManualNodeResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteManualNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteManualNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteManualNodeResponse setBody(ExecuteManualNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteManualNodeResponseBody getBody() {
        return this.body;
    }

}
