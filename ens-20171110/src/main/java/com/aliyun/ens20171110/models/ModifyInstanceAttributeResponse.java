// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceAttributeResponseBody body;

    public static ModifyInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeResponse self = new ModifyInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceAttributeResponse setBody(ModifyInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
