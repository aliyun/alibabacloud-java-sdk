// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetAccountAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAccountAttributesResponseBody body;

    public static SetAccountAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccountAttributesResponse self = new SetAccountAttributesResponse();
        return TeaModel.build(map, self);
    }

    public SetAccountAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAccountAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAccountAttributesResponse setBody(SetAccountAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAccountAttributesResponseBody getBody() {
        return this.body;
    }

}
