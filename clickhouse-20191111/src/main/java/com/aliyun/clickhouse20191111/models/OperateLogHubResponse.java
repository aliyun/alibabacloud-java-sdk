// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class OperateLogHubResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public OperateLogHubResponse setBody(OperateLogHubResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateLogHubResponseBody getBody() {
        return this.body;
    }

}
