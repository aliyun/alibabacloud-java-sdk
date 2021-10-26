// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetIpControlApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetIpControlApisResponseBody body;

    public static SetIpControlApisResponse build(java.util.Map<String, ?> map) throws Exception {
        SetIpControlApisResponse self = new SetIpControlApisResponse();
        return TeaModel.build(map, self);
    }

    public SetIpControlApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetIpControlApisResponse setBody(SetIpControlApisResponseBody body) {
        this.body = body;
        return this;
    }
    public SetIpControlApisResponseBody getBody() {
        return this.body;
    }

}
