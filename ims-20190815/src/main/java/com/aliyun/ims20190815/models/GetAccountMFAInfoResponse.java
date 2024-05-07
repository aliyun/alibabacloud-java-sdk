// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountMFAInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountMFAInfoResponseBody body;

    public static GetAccountMFAInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountMFAInfoResponse self = new GetAccountMFAInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountMFAInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountMFAInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountMFAInfoResponse setBody(GetAccountMFAInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountMFAInfoResponseBody getBody() {
        return this.body;
    }

}
