// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetDomainGreenManagerConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDomainGreenManagerConfigResponseBody body;

    public static SetDomainGreenManagerConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDomainGreenManagerConfigResponse self = new SetDomainGreenManagerConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetDomainGreenManagerConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDomainGreenManagerConfigResponse setBody(SetDomainGreenManagerConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainGreenManagerConfigResponseBody getBody() {
        return this.body;
    }

}
