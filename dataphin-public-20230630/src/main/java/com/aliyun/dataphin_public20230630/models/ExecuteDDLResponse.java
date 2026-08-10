// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteDDLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteDDLResponseBody body;

    public static ExecuteDDLResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDDLResponse self = new ExecuteDDLResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteDDLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteDDLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteDDLResponse setBody(ExecuteDDLResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteDDLResponseBody getBody() {
        return this.body;
    }

}
