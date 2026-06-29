// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetDcvDelegationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDcvDelegationResponseBody body;

    public static GetDcvDelegationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDcvDelegationResponse self = new GetDcvDelegationResponse();
        return TeaModel.build(map, self);
    }

    public GetDcvDelegationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDcvDelegationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDcvDelegationResponse setBody(GetDcvDelegationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDcvDelegationResponseBody getBody() {
        return this.body;
    }

}
