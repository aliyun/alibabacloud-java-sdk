// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class IssueSoftphoneCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IssueSoftphoneCommandResponseBody body;

    public static IssueSoftphoneCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        IssueSoftphoneCommandResponse self = new IssueSoftphoneCommandResponse();
        return TeaModel.build(map, self);
    }

    public IssueSoftphoneCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IssueSoftphoneCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IssueSoftphoneCommandResponse setBody(IssueSoftphoneCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public IssueSoftphoneCommandResponseBody getBody() {
        return this.body;
    }

}
