// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceVpcAttributeResponseBody body;

    public static ModifyInstanceVpcAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAttributeResponse self = new ModifyInstanceVpcAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceVpcAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceVpcAttributeResponse setBody(ModifyInstanceVpcAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceVpcAttributeResponseBody getBody() {
        return this.body;
    }

}
