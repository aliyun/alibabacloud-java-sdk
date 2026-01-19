// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCloudAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudAccountResponseBody body;

    public static GetCloudAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAccountResponse self = new GetCloudAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudAccountResponse setBody(GetCloudAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudAccountResponseBody getBody() {
        return this.body;
    }

}
