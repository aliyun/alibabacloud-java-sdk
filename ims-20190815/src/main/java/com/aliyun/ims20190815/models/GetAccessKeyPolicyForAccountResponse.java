// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyPolicyForAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccessKeyPolicyForAccountResponseBody body;

    public static GetAccessKeyPolicyForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyPolicyForAccountResponse self = new GetAccessKeyPolicyForAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyPolicyForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessKeyPolicyForAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessKeyPolicyForAccountResponse setBody(GetAccessKeyPolicyForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessKeyPolicyForAccountResponseBody getBody() {
        return this.body;
    }

}
