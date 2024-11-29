// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class OperateLogHubResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateLogHubResponseBody body;

    public static OperateLogHubResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateLogHubResponse self = new OperateLogHubResponse();
        return TeaModel.build(map, self);
    }

    public OperateLogHubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateLogHubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateLogHubResponse setBody(OperateLogHubResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateLogHubResponseBody getBody() {
        return this.body;
    }

}
