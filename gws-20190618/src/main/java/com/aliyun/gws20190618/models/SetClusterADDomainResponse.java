// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterADDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetClusterADDomainResponseBody body;

    public static SetClusterADDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        SetClusterADDomainResponse self = new SetClusterADDomainResponse();
        return TeaModel.build(map, self);
    }

    public SetClusterADDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetClusterADDomainResponse setBody(SetClusterADDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public SetClusterADDomainResponseBody getBody() {
        return this.body;
    }

}
