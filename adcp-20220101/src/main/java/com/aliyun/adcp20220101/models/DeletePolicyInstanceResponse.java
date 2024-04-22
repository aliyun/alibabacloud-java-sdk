// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DeletePolicyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolicyInstanceResponseBody body;

    public static DeletePolicyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyInstanceResponse self = new DeletePolicyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicyInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolicyInstanceResponse setBody(DeletePolicyInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicyInstanceResponseBody getBody() {
        return this.body;
    }

}
