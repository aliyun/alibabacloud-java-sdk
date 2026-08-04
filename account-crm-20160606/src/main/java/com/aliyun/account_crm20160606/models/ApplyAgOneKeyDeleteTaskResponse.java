// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ApplyAgOneKeyDeleteTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyAgOneKeyDeleteTaskResponseBody body;

    public static ApplyAgOneKeyDeleteTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAgOneKeyDeleteTaskResponse self = new ApplyAgOneKeyDeleteTaskResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAgOneKeyDeleteTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyAgOneKeyDeleteTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyAgOneKeyDeleteTaskResponse setBody(ApplyAgOneKeyDeleteTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyAgOneKeyDeleteTaskResponseBody getBody() {
        return this.body;
    }

}
