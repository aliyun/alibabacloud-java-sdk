// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetIpAllowListConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetIpAllowListConfigResponseBody body;

    public static SetIpAllowListConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetIpAllowListConfigResponse self = new SetIpAllowListConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetIpAllowListConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetIpAllowListConfigResponse setBody(SetIpAllowListConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetIpAllowListConfigResponseBody getBody() {
        return this.body;
    }

}
