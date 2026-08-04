// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ApplyAgOneKeyOnlyCheckerTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyAgOneKeyOnlyCheckerTaskResponseBody body;

    public static ApplyAgOneKeyOnlyCheckerTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAgOneKeyOnlyCheckerTaskResponse self = new ApplyAgOneKeyOnlyCheckerTaskResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAgOneKeyOnlyCheckerTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyAgOneKeyOnlyCheckerTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyAgOneKeyOnlyCheckerTaskResponse setBody(ApplyAgOneKeyOnlyCheckerTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyAgOneKeyOnlyCheckerTaskResponseBody getBody() {
        return this.body;
    }

}
