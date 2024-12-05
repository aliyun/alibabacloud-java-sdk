// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class InvalidateThirdPartyAppLoginStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvalidateThirdPartyAppLoginStateResponseBody body;

    public static InvalidateThirdPartyAppLoginStateResponse build(java.util.Map<String, ?> map) throws Exception {
        InvalidateThirdPartyAppLoginStateResponse self = new InvalidateThirdPartyAppLoginStateResponse();
        return TeaModel.build(map, self);
    }

    public InvalidateThirdPartyAppLoginStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvalidateThirdPartyAppLoginStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvalidateThirdPartyAppLoginStateResponse setBody(InvalidateThirdPartyAppLoginStateResponseBody body) {
        this.body = body;
        return this;
    }
    public InvalidateThirdPartyAppLoginStateResponseBody getBody() {
        return this.body;
    }

}
