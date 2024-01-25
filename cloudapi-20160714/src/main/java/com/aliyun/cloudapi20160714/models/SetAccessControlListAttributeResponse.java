// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetAccessControlListAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAccessControlListAttributeResponseBody body;

    public static SetAccessControlListAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccessControlListAttributeResponse self = new SetAccessControlListAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SetAccessControlListAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAccessControlListAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAccessControlListAttributeResponse setBody(SetAccessControlListAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAccessControlListAttributeResponseBody getBody() {
        return this.body;
    }

}
