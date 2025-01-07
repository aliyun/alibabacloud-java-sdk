// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeForConsoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceVpcAttributeForConsoleResponseBody body;

    public static ModifyInstanceVpcAttributeForConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAttributeForConsoleResponse self = new ModifyInstanceVpcAttributeForConsoleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAttributeForConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceVpcAttributeForConsoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceVpcAttributeForConsoleResponse setBody(ModifyInstanceVpcAttributeForConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceVpcAttributeForConsoleResponseBody getBody() {
        return this.body;
    }

}
