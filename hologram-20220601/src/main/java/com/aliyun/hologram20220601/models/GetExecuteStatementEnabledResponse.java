// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetExecuteStatementEnabledResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExecuteStatementEnabledResponseBody body;

    public static GetExecuteStatementEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExecuteStatementEnabledResponse self = new GetExecuteStatementEnabledResponse();
        return TeaModel.build(map, self);
    }

    public GetExecuteStatementEnabledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExecuteStatementEnabledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExecuteStatementEnabledResponse setBody(GetExecuteStatementEnabledResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExecuteStatementEnabledResponseBody getBody() {
        return this.body;
    }

}
