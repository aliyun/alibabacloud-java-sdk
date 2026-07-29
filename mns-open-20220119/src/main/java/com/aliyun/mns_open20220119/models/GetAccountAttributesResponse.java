// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetAccountAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountAttributesResponseBody body;

    public static GetAccountAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountAttributesResponse self = new GetAccountAttributesResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountAttributesResponse setBody(GetAccountAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountAttributesResponseBody getBody() {
        return this.body;
    }

}
