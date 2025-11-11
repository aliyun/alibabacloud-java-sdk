// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUserAuthnSourceMappingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserAuthnSourceMappingsResponseBody body;

    public static ListUserAuthnSourceMappingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserAuthnSourceMappingsResponse self = new ListUserAuthnSourceMappingsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserAuthnSourceMappingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserAuthnSourceMappingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserAuthnSourceMappingsResponse setBody(ListUserAuthnSourceMappingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserAuthnSourceMappingsResponseBody getBody() {
        return this.body;
    }

}
