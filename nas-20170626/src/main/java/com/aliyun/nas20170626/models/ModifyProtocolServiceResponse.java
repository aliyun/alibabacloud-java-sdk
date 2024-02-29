// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyProtocolServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyProtocolServiceResponseBody body;

    public static ModifyProtocolServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtocolServiceResponse self = new ModifyProtocolServiceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyProtocolServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyProtocolServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyProtocolServiceResponse setBody(ModifyProtocolServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyProtocolServiceResponseBody getBody() {
        return this.body;
    }

}
