// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeApplyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeApplyResponseBody body;

    public static ChangeApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeApplyResponse self = new ChangeApplyResponse();
        return TeaModel.build(map, self);
    }

    public ChangeApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeApplyResponse setBody(ChangeApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeApplyResponseBody getBody() {
        return this.body;
    }

}
