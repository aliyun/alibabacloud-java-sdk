// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyDomainProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDomainProxyResponseBody body;

    public static ModifyDomainProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainProxyResponse self = new ModifyDomainProxyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDomainProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDomainProxyResponse setBody(ModifyDomainProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDomainProxyResponseBody getBody() {
        return this.body;
    }

}
