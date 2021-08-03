// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetOfficeSiteSsoStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetOfficeSiteSsoStatusResponseBody body;

    public static SetOfficeSiteSsoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetOfficeSiteSsoStatusResponse self = new SetOfficeSiteSsoStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetOfficeSiteSsoStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetOfficeSiteSsoStatusResponse setBody(SetOfficeSiteSsoStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetOfficeSiteSsoStatusResponseBody getBody() {
        return this.body;
    }

}
