// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnIpaDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDcdnIpaDomainResponseBody body;

    public static UpdateDcdnIpaDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnIpaDomainResponse self = new UpdateDcdnIpaDomainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnIpaDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDcdnIpaDomainResponse setBody(UpdateDcdnIpaDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDcdnIpaDomainResponseBody getBody() {
        return this.body;
    }

}
