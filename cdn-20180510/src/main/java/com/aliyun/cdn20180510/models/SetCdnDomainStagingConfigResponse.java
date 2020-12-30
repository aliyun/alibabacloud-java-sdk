// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetCdnDomainStagingConfigResponseBody body;

    public static SetCdnDomainStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainStagingConfigResponse self = new SetCdnDomainStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCdnDomainStagingConfigResponse setBody(SetCdnDomainStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCdnDomainStagingConfigResponseBody getBody() {
        return this.body;
    }

}
