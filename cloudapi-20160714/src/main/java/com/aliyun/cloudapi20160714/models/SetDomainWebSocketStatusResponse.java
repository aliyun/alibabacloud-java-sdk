// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetDomainWebSocketStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDomainWebSocketStatusResponseBody body;

    public static SetDomainWebSocketStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDomainWebSocketStatusResponse self = new SetDomainWebSocketStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDomainWebSocketStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDomainWebSocketStatusResponse setBody(SetDomainWebSocketStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainWebSocketStatusResponseBody getBody() {
        return this.body;
    }

}
