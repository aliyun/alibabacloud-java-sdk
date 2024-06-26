// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ConfirmConsortiumMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmConsortiumMemberResponseBody body;

    public static ConfirmConsortiumMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmConsortiumMemberResponse self = new ConfirmConsortiumMemberResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmConsortiumMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmConsortiumMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmConsortiumMemberResponse setBody(ConfirmConsortiumMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmConsortiumMemberResponseBody getBody() {
        return this.body;
    }

}
