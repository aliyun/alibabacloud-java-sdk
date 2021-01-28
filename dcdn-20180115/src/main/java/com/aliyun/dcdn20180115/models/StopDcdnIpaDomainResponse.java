// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class StopDcdnIpaDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopDcdnIpaDomainResponseBody body;

    public static StopDcdnIpaDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDcdnIpaDomainResponse self = new StopDcdnIpaDomainResponse();
        return TeaModel.build(map, self);
    }

    public StopDcdnIpaDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDcdnIpaDomainResponse setBody(StopDcdnIpaDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDcdnIpaDomainResponseBody getBody() {
        return this.body;
    }

}
