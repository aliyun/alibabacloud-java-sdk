// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetAgOneKeyDeleteTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgOneKeyDeleteTaskResponseBody body;

    public static GetAgOneKeyDeleteTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgOneKeyDeleteTaskResponse self = new GetAgOneKeyDeleteTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetAgOneKeyDeleteTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgOneKeyDeleteTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgOneKeyDeleteTaskResponse setBody(GetAgOneKeyDeleteTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgOneKeyDeleteTaskResponseBody getBody() {
        return this.body;
    }

}
